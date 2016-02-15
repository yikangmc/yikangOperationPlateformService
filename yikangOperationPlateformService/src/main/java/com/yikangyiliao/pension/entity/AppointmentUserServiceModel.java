package com.yikangyiliao.pension.entity;

import java.util.Date;

import com.yikangyiliao.base.utils.DateUtils;




public class AppointmentUserServiceModel {

	private long appointmentUserId;
	
    private String createTime;

    private String mobileNumber="";

    private Long serviceItemId;

    private String remarks="";
    
    private String serviceTitle="";
    
    private Float servicePrice;
    
   // private String loginName;
    
    private Long createUserId;
    

	public long getAppointmentUserId() {
		return appointmentUserId;
	}

	public void setAppointmentUserId(long appointmentUserId) {
		this.appointmentUserId = appointmentUserId;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = DateUtils.formateDateAndTime(createTime);
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public Long getServiceItemId() {
		return serviceItemId;
	}

	public void setServiceItemId(Long serviceItemId) {
		this.serviceItemId = serviceItemId;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getServiceTitle() {
		return serviceTitle;
	}

	public void setServiceTitle(String serviceTitle) {
		this.serviceTitle = serviceTitle;
	}

	public Float getServicePrice() {
		return servicePrice;
	}

	public void setServicePrice(Float servicePrice) {
		this.servicePrice = servicePrice;
	}

	public Long getCreateUserId() {
		return createUserId;
	}

	public void setCreateUserId(Long createUserId) {
		this.createUserId = createUserId;
	}

//	public String getLoginName() {
//		return loginName;
//	}
//
//	public void setLoginName(String loginName) {
//		this.loginName = loginName;
//	}
    
	
}
