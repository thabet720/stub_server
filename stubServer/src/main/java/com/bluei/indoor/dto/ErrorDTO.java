package com.bluei.indoor.dto;


public class ErrorDTO {
	private int code;
	private String message;
	
	public ErrorDTO() {
		super();
	}
	
	public ErrorDTO(int code, String message) {
		super();
		this.code = code;
		this.message = message;
	}

	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "ErrorDTO [code=" + code + ", message=" + message + "]";
	}
	
	
	

}
