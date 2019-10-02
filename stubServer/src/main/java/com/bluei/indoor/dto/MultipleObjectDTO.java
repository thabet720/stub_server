package com.bluei.indoor.dto;


import java.util.HashMap;
import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MultipleObjectDTO {
	private String result;
	@Autowired
	private  Object data;
	@Autowired
	private ErrorDTO error;
	
	
	public MultipleObjectDTO() {
		super();
		data = new HashMap<String, Object>();
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	

	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public ErrorDTO getError() {
		return error;
	}
	public void setError(ErrorDTO error) {
		this.error = error;
	}
	@Override
	public String toString() {
		return "MultipleObjectDTO [result=" + result + ", data=" + data + ", error=" + error + "]";
	}
	
	

}
