package com.sb.act.api.endpoint;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Component
@Endpoint(id="pranay",enableByDefault=true)
public class MyEndPoint {
	
	@ReadOperation
	public MyEndPointResponse newFeature()
	{
		return new MyEndPointResponse(123456,"Pranay","Bad Mood");
	}
	
}
	
@AllArgsConstructor
@NoArgsConstructor
	class MyEndPointResponse
	{
		private int id;
		private String name;
		private String status;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public MyEndPointResponse(int id, String name, String status) {
			this.id = id;
			this.name = name;
			this.status = status;
		}
		public MyEndPointResponse() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
		
		
		
	

}
