package com.example.employee.exception;

public class EmployeeNotFoundException extends RuntimeException{

	 
	private static final long serialVersionUID = 1L;

	public EmployeeNotFoundException(String m) {
	        super(m);
	    }
}
