package com.atguigu.wechat.config;

import cn.binarywang.wx.miniapp.api.WxMaService;
import cn.binarywang.wx.miniapp.api.WxMaUserService;
import cn.binarywang.wx.miniapp.api.impl.WxMaServiceImpl;
import cn.binarywang.wx.miniapp.api.impl.WxMaUserServiceImpl;
import cn.binarywang.wx.miniapp.config.impl.WxMaDefaultConfigImpl;
import com.atguigu.wechat.pojo.WxMaProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @autor wwl
 * @date 2022/4/17-19:19
 */
@Slf4j
@Configuration
public class WxMaconfiguration {

    @Autowired
    private WxMaProperties wxMaProperties;




    @Bean
    public WxMaService wxMaService() {
        log.info("============初始化微信小程序服务============");
        WxMaDefaultConfigImpl config = new WxMaDefaultConfigImpl();
        config.setAppid(wxMaProperties.getAppid());
        config.setSecret(wxMaProperties.getSecret());
        WxMaService service=new WxMaServiceImpl();
        service.setWxMaConfig(config);
        return  service;
    }

    @Bean
    public WxMaUserService wxMaUserService(){
        WxMaUserServiceImpl wxMaUserService = new WxMaUserServiceImpl(wxMaService());
        return wxMaUserService;
    }

}
