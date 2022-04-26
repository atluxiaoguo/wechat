package com.atguigu.wechat.service;

import com.atguigu.wechat.pojo.User;
import com.atguigu.wechat.pojo.UserExample;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @autor wwl
 * @date 2022/4/25-17:01
 */
@Service
public interface UserService {

//    添加用户
    int saveUser(User user);

//    通过openid删除用户
    int deleteUser(String openid);

//    按条件删除
    int deleteByExample(UserExample example);

//    按主键更新
    int updateUserByPrimaryKey(User record);

//   按主键更新值不为null的字段
    int updateUserByPriSel(User user);

//    按条件更新
    int updateUserByExample(User record, UserExample example);

//    按条件更新值不为null的字段
    int updateUserByExampleSelective(User record, UserExample example);

//    按主键查询一个用户
    User selectSingleUser(String openid);

//    按条件查询
    List<User> selectUsersByExample(UserExample example);
}
