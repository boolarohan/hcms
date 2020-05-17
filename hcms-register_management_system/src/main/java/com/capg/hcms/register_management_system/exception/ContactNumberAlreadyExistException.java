package com.capg.hcms.register_management_system.exception;

/*******************************************************************************************************************************
-Author                   :     Boola Rohan
-Created/Modified Date    :     27-04-2020
-Description              :     ContactNumberAlreadyExistException class to handle runtime exception
*******************************************************************************************************************************/

public class ContactNumberAlreadyExistException extends RuntimeException {

	public ContactNumberAlreadyExistException(String message) {
		super(message);
	}

	public ContactNumberAlreadyExistException() {
		super();
	}
}
