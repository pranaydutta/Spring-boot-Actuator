package com.sb.act.api.controller;

import java.net.URL;
import java.net.URLConnection;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class InternetHealthMetrics implements HealthIndicator{

	@Override
	public Health health() {
		
		return checkInternetConnection()==true?Health.up().withDetail("Sucess Code", "Active Internet Connection").build():Health.down().withDetail("error Code", "InActive Internet Connection").build();
	}
	
	private boolean checkInternetConnection()
	{
		boolean flag=false;
		try{
			
			URL url=new URL("http://www.google.com");
			URLConnection connection=url.openConnection();
			connection.connect();
			flag=true;
		}
		catch (Exception e) {
			flag=false;
		}
		return flag;
	}
	
	

}
