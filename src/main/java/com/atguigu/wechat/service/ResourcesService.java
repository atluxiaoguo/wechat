package com.atguigu.wechat.service;

import com.atguigu.wechat.pojo.Resources;
import com.atguigu.wechat.pojo.ResourcesExample;
import com.atguigu.wechat.pojo.User;
import com.atguigu.wechat.pojo.UserExample;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @autor wwl
 * @date 2022/5/29-23:32
 */
@Service
public interface ResourcesService {
    //    添加资源
    int saveResource(Resources resources);

//        通过hash删除用户
    int deleteResource(String rhash);

    //    按条件查询
    List<Resources> selectResourcesByExample(ResourcesExample resourcesExample);

}
