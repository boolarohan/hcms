package com.capg.hcms.register_management_system.exception;

/*******************************************************************************************************************************
-Author                   :     Boola Rohan
-Created/Modified Date    :     27-04-2020
-Description              :     EmailAlreadyExistException class to handle runtime exception
*******************************************************************************************************************************/

public class EmailAlreadyExistException extends RuntimeException {

	public EmailAlreadyExistException(String message) {
		super(message);
	}

	public EmailAlreadyExistException() {
		super();
	}
}
