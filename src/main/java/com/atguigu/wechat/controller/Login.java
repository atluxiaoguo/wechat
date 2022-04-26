package com.atguigu.wechat.controller;

import cn.binarywang.wx.miniapp.api.WxMaService;
import cn.binarywang.wx.miniapp.api.WxMaUserService;
import cn.binarywang.wx.miniapp.bean.WxMaJscode2SessionResult;
import cn.binarywang.wx.miniapp.bean.WxMaUserInfo;
import com.alibaba.fastjson.JSONObject;
import com.atguigu.wechat.pojo.User;
import com.atguigu.wechat.service.impl.UserServiceImpl;
import com.atguigu.wechat.util.Result;
import com.atguigu.wechat.util.ResultCodeEnum;
import me.chanjar.weixin.common.error.WxErrorException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
//import java.util.Date;
import java.util.Date;
import java.util.List;

/**用户登录
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
    @Autowired
    private Result result;
    @Autowired
    private UserServiceImpl userService;



    @PostMapping("/")
    @ResponseBody
    public Object LoginOk(@RequestBody String jsonStr ,HttpSession request) throws WxErrorException {

//      将json格式转化成对象，jsonstr的内容:{"Info":{"encryptedData":"phRlRatn2s3Cw1gYpmnlUFVOJQBM+sYt/ZPEnom1TKWLUenFZsnaOCTmSylMOlTnL5DSUqfyIsOlPRUVAMjUXLuNuc6K82d+NAAJRuZyVwZrRcTVfzETavJ51jHGYK5sU6GNXhL3rorypYzmCTjXgHvmadW0GAHb3PdbeKdYbzm6ANtZGTL4YUDOqTrU7mBTlzyOwgyLY3ticIWRrPnUYm1VUrcpyoPMr0Nb0Wu3j7a5vBfeo3F3kCokzqz/fElc50CO1VteKzfkwoIWXrSBm0t/JKNjx4FlbHRi50DVxsWqDEMEc/Hm4ng4ywpoUegAc4Nyx5sPwaGa5g85NCYvxiJXuz4mYSyJ5IUJaM88+bFXPXheLwu8mzV693vQSwOtmZh2P0Tel/hIYSOZ1rYPCXr9MSDDyvTCO2hIht54SBw=","iv":"OkTdrNscgdxTnMP6ZXc28g==","signature":"49dd49e78a3d4cba5a1be1be2e25744d290e5ce8","userInfo":{"nickName":"Dear～柘木塘","gender":0,"language":"zh_CN","city":"","province":"","country":"","avatarUrl":"https://thirdwx.qlogo.cn/mmopen/vi_32/sm5IXHKibVUBmYwyjTdmAFmiaS0s465JrBYjeJWQg7eExYEacarSibWpVVibrYFMAbf4vbmd93iamzoqUFzEXE87vfQ/132"},"rawData":"{\"nickName\":\"Dear～柘木塘\",\"gender\":0,\"language\":\"zh_CN\",\"city\":\"\",\"province\":\"\",\"country\":\"\",\"avatarUrl\":\"https://thirdwx.qlogo.cn/mmopen/vi_32/sm5IXHKibVUBmYwyjTdmAFmiaS0s465JrBYjeJWQg7eExYEacarSibWpVVibrYFMAbf4vbmd93iamzoqUFzEXE87vfQ/132\"}","errMsg":"getUserProfile:ok"},"msg":{"errMsg":"login:ok","code":"043gdHll2rS2594vA3nl2ivrCR3gdHlV"}}
        JSONObject jsonObject=JSONObject.parseObject(jsonStr);
        JSONObject info=jsonObject.getJSONObject("Info");
        JSONObject msg=jsonObject.getJSONObject("msg");
        JSONObject userInfo=info.getJSONObject("userInfo");

        String code=msg.getString("code");
        Date date = new Date();
        WxMaJscode2SessionResult sessionInfo = wxMaUserService.getSessionInfo(code);
        String token=wxMaService.getAccessToken();

////      用户信息获取
        String openId=sessionInfo.getOpenid();
        String sessionKey=sessionInfo.getSessionKey();
        String createTime= String.valueOf(date.getTime());
        String lastVisitTime=String.valueOf(date.getTime());
        String nickName=userInfo.getString("nickName");
        String gender=userInfo.getString("gender");
        String avatarUrl=userInfo.getString("avatarUrl");


//      gender,nickname,avatarUrl需要解密,微信小程序会传来四个数据 其中两个为 rawData和 sighnature ，还有两个为  encryptedData 和 iv,encryptedData  session_key iv  这三个数据 经过特定的解密之后， 就可以得到用户信息了。
//        WxMaUserInfo wxMaUserInfo =wxMaUserService.getUserInfo(sessionKey,encryptedData,iv);
//        String gender=wxMaUserInfo.getGender();
//        String nickName=wxMaUserInfo.getNickName();
//        String avatarUrl=wxMaUserInfo.getAvatarUrl();


        userService.saveUser(new User(openId,sessionKey,createTime,lastVisitTime,gender,nickName,avatarUrl));

        System.out.println("token:"+token);
        System.out.println("openid:"+openId+"\nsessionkey:"+sessionKey);
        System.out.println("nickname:"+nickName);

        result=result.build(token, ResultCodeEnum.SUCCESS);System.out.println("rawDate:"+jsonStr);
        return result;
    }

}
