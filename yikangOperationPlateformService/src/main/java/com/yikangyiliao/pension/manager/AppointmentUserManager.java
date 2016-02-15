package com.yikangyiliao.pension.manager;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.yikangyiliao.pension.dao.AppointmentUserDao;
import com.yikangyiliao.pension.entity.AppointmentUser;
import com.yikangyiliao.pension.entity.AppointmentUserServiceModel;


@Component
public class AppointmentUserManager {

	
	@Autowired
	private AppointmentUserDao appointmentUserDao;
	
	
	
	/**
	 * @author liushuaic
	 * @date 2015/09/21 12:26
	 * 添加预约用户
	 * */
	public int insertSelective(AppointmentUser appointmentUser){
		return appointmentUserDao.insertSelective(appointmentUser);
	}
	
	public int updateByPrimaryKeySelective(AppointmentUser appointmentUser){
		return appointmentUserDao.updateByPrimaryKeySelective(appointmentUser);
	}
	
	
	/**
	 * @author liushuaic
	 * @date 2015/09/21 14:16
	 * 获取预约用户列表
	 * */
	public List<AppointmentUser> getAppointmentUserListPage(Map<String,Object> param){
		return appointmentUserDao.getAppointmentUserListPage(param);
	}
	
	
	/**
	 * @author liushuaic
	 * @date 2015/09/21 17:06
	 * 查询某一个预约列表，根据，手机号
	 * */
	public List<AppointmentUser> findAppointmentUserByMobileNumber(String mobileNumber){
		return appointmentUserDao.findAppointmentUserByMobileNumber(mobileNumber);
	}
	
	
	/**
	 * @author liushuaic
	 * @date 2016/01/29 14:46
	 * @desc 获取预约的用户
	 * 
	 * */
	public List<AppointmentUserServiceModel> getAppointmentUserForServiceListPage(Map<String,Object> paramData){
		return  appointmentUserDao.getAppointmentUserForServiceListPage(paramData);
	}
	 
}
