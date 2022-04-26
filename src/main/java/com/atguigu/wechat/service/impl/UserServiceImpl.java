package com.atguigu.wechat.service.impl;

import com.atguigu.wechat.mapper.UserMapper;
import com.atguigu.wechat.pojo.User;
import com.atguigu.wechat.pojo.UserExample;
import com.atguigu.wechat.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**用户相关业务
 * @autor wwl
 * @date 2022/4/25-17:01
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int saveUser(User user) {
        return userMapper.insert(user);
    }

    @Override
    public int deleteUser(String openid) {
        return userMapper.deleteByPrimaryKey(openid);
    }

    @Override
    public int deleteByExample(UserExample example) {
        return userMapper.deleteByExample(example);
    }

    @Override
    public int updateUserByPrimaryKey(User record) {
        return userMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateUserByPriSel(User user) {
        return userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public int updateUserByExample(User record, UserExample example) {
        return userMapper.updateByExample(record,example);
    }

    @Override
    public int updateUserByExampleSelective(User record, UserExample example) {
        return userMapper.updateByExampleSelective(record, example);
    }



    @Override
    public User selectSingleUser(String openid) {
        return userMapper.selectByPrimaryKey(openid);
    }

    @Override
    public List<User> selectUsersByExample(UserExample example) {
        return userMapper.selectByExample(example);
    }


}
