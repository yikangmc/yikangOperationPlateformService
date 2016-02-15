package com.yikangyiliao.pension.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.yikangyiliao.pension.entity.AppointmentUser;
import com.yikangyiliao.pension.entity.AppointmentUserServiceModel;


public interface AppointmentUserDao {
    int deleteByPrimaryKey(Long appointmentUserId);

    int insert(AppointmentUser record);

    int insertSelective(AppointmentUser record);

    AppointmentUser selectByPrimaryKey(Long appointmentUserId);

    int updateByPrimaryKeySelective(AppointmentUser record);

    int updateByPrimaryKey(AppointmentUser record);
    
    
    /**
     * @author liushuaic
     * @date 2015/09/21 14:06 
     * 查询预约列表
     * */
    List<AppointmentUser> getAppointmentUserListPage(Map<String,Object> param);
    
    
    /**
     * @author liushuaic
     * @date 2015/09/21 16:22
     * */
    List<AppointmentUser> findAppointmentUserByMobileNumber(@Param("mobileNumber") String mobileNumber);
    
    
    
    
    /**
     * 
     * @author liushuaic
     * @date 2016/01/29 14:42
     * @desc 获取服务列表 forService
     * 
     * **/
    List<AppointmentUserServiceModel> getAppointmentUserForServiceListPage(Map<String,Object> paramData);
    
    
}