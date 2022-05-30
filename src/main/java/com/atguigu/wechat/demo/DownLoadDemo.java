package com.atguigu.wechat.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * @autor wwl
 * @date 2022/4/29-9:42
 */
@Controller
public class DownLoadDemo {
    @RequestMapping("/download")
    public String downLoadDemo(MultipartFile resource, HttpSession session) throws IOException {

//        获取上传文件名
        String filename=resource.getOriginalFilename();
//        获取上传文件的后缀名
        String suffixName=filename.substring(filename.lastIndexOf("."));
//        将uuid作为文件名
        String uuid= UUID.randomUUID().toString();
//        uuid和后缀名拼接
        filename=uuid+suffixName;
        ServletContext servletContext=session.getServletContext();
        String resourcePath=servletContext.getRealPath("resources");

        File file=new File(resourcePath);
        if(!file.exists()){
//            如果不存在就创建photo文件加
            file.mkdir();
        }

        String finalpath=resourcePath+File.separator+filename;
        resource.transferTo(new File(finalpath));
        return "success";
    }
}
