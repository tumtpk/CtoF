package com.demo;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(endpointInterface = "com.demo.CourseServiceInterface")
public class CourseService {
	
	@WebMethod
	public String calulateGrade(@WebParam(name = "score") int score) {
		return "A";
	}
	
}
