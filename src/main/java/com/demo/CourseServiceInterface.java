package com.demo;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface CourseServiceInterface {
	
	@WebMethod
	public String calulateGrade(@WebParam(name = "score") int score);
	
}
