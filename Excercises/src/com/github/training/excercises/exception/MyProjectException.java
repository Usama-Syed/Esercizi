package com.github.training.excercises.exception;

public class MyProjectException extends Exception {
	
	private static final long serialVersionUID = -9153659764748673699L;
	
	private String errorMessage;
	
	private String customMessage;
	
	public String getErrorMessage() {
		return errorMessage;
	}
	
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	public String getCustomMessage() {
		return customMessage;
	}
	
	public void setCustomMessage(String customMessage) {
		this.customMessage = customMessage;
	}
	
	
}
