package com.demo;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface KFCServiceInterface {
	
	@WebMethod
	public String wingzap();
}
