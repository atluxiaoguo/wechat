package com.atguigu.wechat.pojo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @autor wwl
 * @date 2022/5/26-17:31
 * 七牛云上传接入
 */
@Data
@Component
@ConfigurationProperties(prefix = "qiniu.miniapp")
public class QiNiuProperties {


    /**
     * 设置七牛存储空间的accessKey
     */
    private String accessKey;

    /**
     * 设置七牛存储空间SecretKey
     */
    private String secretKey;

    /**
     * 储存空间名
     */
    private String bucket;
}
