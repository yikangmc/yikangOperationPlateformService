package com.yikangyiliao.pension.dao;

import java.util.List;
import java.util.Map;

import com.yikangyiliao.pension.entity.UserInfo;
import com.yikangyiliao.pension.entity.UserInfoServiceModel;

public interface UserInfoDao {
    int deleteByPrimaryKey(Long userInfoId);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(Long userInfoId);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);
    
    
    /**
     * @author liushuaic
     * @date 2015/09/07 13:41
     * @param userId 用户id
     * 
     * 获取某一个用户信息，根据用户id
     * **/
    UserInfo getUserInfoByUserId(Long userId);
    
    
    
    
    /**
     * @author liushuaic
     * @date 2016/01/29 19:47
     * @desc 获取用户列表
     * 
     * **/
    List<UserInfoServiceModel> getUserInfoListPage(Map<String,Object> paramData);
    
    
    
    
}