package com.yikangyiliao.pension.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yikangyiliao.pension.common.error.ExceptionConstants;
import com.yikangyiliao.pension.common.page.PageParameter;
import com.yikangyiliao.pension.common.response.ResponseMessage;
import com.yikangyiliao.pension.entity.AppointmentUserServiceModel;
import com.yikangyiliao.pension.manager.AppointmentUserManager;

@Service(value="appointmentUserService")
public class AppointmentUserService {
	
	@Autowired
	private AppointmentUserManager appointmentUserManager;
	
	
	
	
	public ResponseMessage getAppointmentList(Map<String,Object> paramData){
		
		ResponseMessage responseMessage=new ResponseMessage();
		
		try{	
			if(paramData.containsKey("page")){
				PageParameter page=new PageParameter();
				paramData.put("page", page);
			}
			List<AppointmentUserServiceModel> data=appointmentUserManager.getAppointmentUserForServiceListPage(paramData);
			responseMessage.setData(data);
			responseMessage.setStatus(ExceptionConstants.responseSuccess.responseSuccess.code);
			responseMessage.setMessage(ExceptionConstants.responseSuccess.responseSuccess.message);
		}catch(Exception e){
			
			responseMessage.setStatus( ExceptionConstants.parameterException.parameterException.errorCode);
			responseMessage.setMessage(ExceptionConstants.parameterException.parameterException.errorMessage);

			e.printStackTrace();
		}
		return responseMessage;
	}

}
