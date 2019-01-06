package com.sb.act.api.controller;

import javax.xml.ws.RespectBinding;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/act")
public class MyController {
	
	
	@GetMapping("/test")
	public String testActuator()
	{
		return "Spring Boot Actuator Example";
	}
	
	
	

}
