package com.atguigu.wechat.pojo;

import lombok.Data;

import java.util.List;

/**
 * @autor wwl
 * @date 2022/5/30-17:59
 * 返回给前端的数据
 */
@Data
public class ReturnDate {
    final String yuming=
            "http://rcfvjtuvm.bkt.clouddn.com/";
    //微信凭证
    String token;
    List<Resources> list;

    public ReturnDate(String token, List<Resources> list) {
        this.token = token;
        this.list = list;
    }

    public ReturnDate() {
    }
}
