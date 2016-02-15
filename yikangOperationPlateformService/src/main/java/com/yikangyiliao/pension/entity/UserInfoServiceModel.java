package com.yikangyiliao.pension.entity;

import com.yikangyiliao.base.utils.DateUtils;

public class UserInfoServiceModel {
	
	private Long userId;
	
	private String loginName="";
	
	private String  address="";
	
	private String mapPositionAddress="";
	
	private String remarks="";
	
	private Long createAt;
	
	private String createAtStr;
	
	private int orderAmount;

	
	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMapPositionAddress() {
		return mapPositionAddress;
	}

	public void setMapPositionAddress(String mapPositionAddress) {
		this.mapPositionAddress = mapPositionAddress;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Long getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Long createAt) {
		this.setCreateAtStr(DateUtils.formateDate(createAt));
		this.createAt = createAt;
	}

	public int getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(int orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getCreateAtStr() {
		return createAtStr;
	}

	public void setCreateAtStr(String createAtStr) {
		this.createAtStr = createAtStr;
	}
	
	
	
	
}
