package com.atguigu.wechat.demo;

import com.alibaba.fastjson.JSONObject;
import com.atguigu.wechat.pojo.QiNiuProperties;
import com.atguigu.wechat.pojo.QiNiuResponse;
import com.atguigu.wechat.pojo.Resources;
import com.atguigu.wechat.service.impl.ResourcesServiceImpl;
import com.qiniu.http.Response;
import com.qiniu.storage.UploadManager;
import com.qiniu.util.Auth;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * @autor wwl
 * @date 2022/5/26-16:07
 */
@Controller
//@DependsOn("auth")
@DependsOn("qiNiuProperties")
public class UploadDemo {
    //记录本次上传的文件数
    int i=0;
    @Autowired
    public QiNiuProperties qiNiuProperties;
    @Autowired
    public Auth auth;
    @Autowired
    public UploadManager uploadManager;
    @Autowired
    ResourcesServiceImpl resourcesService;

    @RequestMapping("/manager/upload")
    public String upLoadLocal(MultipartFile resource, HttpSession session, @RequestParam String rtitle,@RequestParam String rtype) throws IOException {

        String upToken = auth.uploadToken(qiNiuProperties.getBucket());

//        获取上传文件名
        String filename=resource.getOriginalFilename();
//        获取上传文件的后缀名
        String suffixName=filename.substring(filename.lastIndexOf("."));
//        将uuid作为文件名
        String uuid= UUID.randomUUID().toString();
//        uuid和后缀名拼接
        filename=uuid+suffixName;

        ServletContext servletContext=session.getServletContext();
        String resourcePath=servletContext.getRealPath("static");
        File file=new File(resourcePath);
        if(!file.exists()){
//            如果不存在就创建photo文件加
            file.mkdir();
        }

        String finalpath=resourcePath+File.separator+filename;
        File realfile=new File(finalpath);
        resource.transferTo(realfile);


        Response response=uploadManager.put(realfile,filename,upToken);
        realfile.delete();
        System.out.println(response.getInfo());
        QiNiuResponse responsseInfo=response.jsonToObject(QiNiuResponse.class);
        String rhash=responsseInfo.hash;
        String rkey=responsseInfo.key;
        resourcesService.saveResource(new Resources(rhash,rkey,rtitle,rtype));

        i+=1;
        session.setAttribute("count",i);
        return "upload";
    }

    @RequestMapping("/")
    String hh(){
        return "success";
    }
    @RequestMapping("/upload")
    String hhh(){
        return "upload";
    }

}
