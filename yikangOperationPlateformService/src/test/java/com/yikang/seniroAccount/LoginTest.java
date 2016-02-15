package com.yikang.seniroAccount;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.yikang.base.SendRequest;

public class LoginTest {

	
	
	@Test
	public void TestLogin(){
		
		try {
			Map<String,Object> paramData=new HashMap<String, Object>();
			paramData.put("loginName","liushuai");
			paramData.put("passWord","liushuai");
			paramData.put("machineCode","123123");
			
			SendRequest.sendPost("login?loginName='liushaui'&passWord='liushuai'&machineCode='123123'",paramData);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
