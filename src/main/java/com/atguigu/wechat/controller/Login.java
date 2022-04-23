package com.atguigu.wechat.controller;

import cn.binarywang.wx.miniapp.api.WxMaService;
import cn.binarywang.wx.miniapp.api.WxMaUserService;
import cn.binarywang.wx.miniapp.bean.WxMaJscode2SessionResult;
import me.chanjar.weixin.common.error.WxErrorException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * @autor wwl
 * @date 2022/4/18-18:50
 */
@Controller
//@DependsOn("wxMaService")
public class Login {

    @Autowired
    public WxMaService wxMaService;
    @Autowired
    private WxMaUserService wxMaUserService;


//    WxMaUserService wxMaUserService=new WxMaUserServiceImpl(wxMaService);


    @PostMapping("/")
    @ResponseBody
    public Object LoginOk(@RequestParam String code , HttpSession request) throws WxErrorException {

//        System.out.println(code);
        WxMaJscode2SessionResult sessionInfo = wxMaUserService.getSessionInfo(code);

        String openid=sessionInfo.getOpenid();
        String unionid=sessionInfo.getUnionid();
        String sessionKey=sessionInfo.getSessionKey();

        Object token=wxMaService.getAccessToken();
        request.setAttribute("Openid",openid);
//        request.setAttribute("token",token);


//        System.out.println(wxMaUserService.getNewPhoneNoInfo(code));

        System.out.println("token:"+token.toString());

        System.out.println("openid:"+openid+"\nUnionid:"+unionid+"\nsessionkey:"+sessionKey);

        return token;


    }

}
