package com.atguigu.wechat.config;

import com.atguigu.wechat.pojo.QiNiuProperties;
import com.qiniu.storage.UploadManager;
import com.qiniu.util.Auth;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;

/**
 * @autor wwl
 * @date 2022/5/26-17:35
 */
@Slf4j
@Configuration
public class QiNiuConfiguration {

    @Autowired
    public QiNiuProperties qiNiuProperties;

    @Bean
    public Auth auth(){
        Auth auth=Auth.create(qiNiuProperties.getAccessKey(),qiNiuProperties.getSecretKey());
        return auth;
    }

    @Bean
    public UploadManager uploadManager(){
        UploadManager uploadManager=new UploadManager(new com.qiniu.storage.Configuration());
        return uploadManager;
    }


}
