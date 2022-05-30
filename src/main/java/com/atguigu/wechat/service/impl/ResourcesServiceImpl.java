package com.atguigu.wechat.service.impl;

import com.atguigu.wechat.mapper.ResourcesMapper;
import com.atguigu.wechat.pojo.Resources;
import com.atguigu.wechat.pojo.ResourcesExample;
import com.atguigu.wechat.service.ResourcesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @autor wwl
 * @date 2022/5/29-23:34
 */
@Service
public class ResourcesServiceImpl implements ResourcesService {

    @Autowired
    public ResourcesMapper resourcesMapper;

    @Override
    public int saveResource(Resources resources) {
        return resourcesMapper.insert(resources);
    }

    @Override
    public int deleteResource(String rhash) {
        return resourcesMapper.deleteByPrimaryKey(rhash);
    }

    @Override
    public List<Resources> selectResourcesByExample(ResourcesExample resourcesExample) {
        ResourcesExample.Criteria criteria=resourcesExample.createCriteria();
        criteria.andRhashIsNotNull();
        List<Resources> resourcesList=resourcesMapper.selectByExample(resourcesExample);
        return resourcesList;
    }
}
