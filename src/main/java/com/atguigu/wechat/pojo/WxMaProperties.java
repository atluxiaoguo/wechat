package com.atguigu.wechat.pojo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @autor wwl
 * @date 2022/4/17-17:07
 */
@Data
@Component
@ConfigurationProperties(prefix = "wx.miniapp")
public class WxMaProperties {


        /**
         * 设置微信小程序的appid
         */
        private String appid;

        /**
         * 设置微信小程序的Secret
         */
        private String secret;

//        /**
//         * 设置微信小程序消息服务器配置的token
//         */
//        private String token;
//
//        /**
//         * 设置微信小程序消息服务器配置的EncodingAESKey
//         */
//        private String aesKey;
//
//        /**
//         * 消息格式，XML或者JSON
//         */
//        private String msgDataFormat;

}