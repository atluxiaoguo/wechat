package com.atguigu.wechat.Demo;

import com.qiniu.common.QiniuException;
import com.qiniu.http.Response;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.UploadManager;
import com.qiniu.util.Auth;
import org.junit.jupiter.api.Test;

import java.io.File;

/**
 * @autor wwl
 * @date 2022/5/26-16:36
 */
public class UploadTest {
    String AK="CLyTaquEijPEA9ikwsVybg1Iv26b03jA1rSa1b5d";
    String SK="k0qlwdpAUz9YGZquTVFsuihTmxzkSEuzZiwKx7dd";
    String bucket = "lbnbhl";

    @Test
    void upload() throws QiniuException {
//        连接文件服务器
        Auth auth=Auth.create(AK,SK);
//        获取token
        String upToken = auth.uploadToken(bucket);
//        创建上传文件管理器
        UploadManager uploadManager=new UploadManager(new Configuration());
//        上传文件
        File file=new File("C:\\Users\\Dear~柘木塘\\OneDrive\\图片\\屏幕快照\\微信图片_20201117162150.jpg");
        Response response=uploadManager.put(file,"微信图片_20201117162150.jpg",upToken);
        System.out.println(response.getInfo());
    }




}
