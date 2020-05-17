package com.capg.hcms.register_management_system.exception;

/*******************************************************************************************************************************
-Author                   :     Boola Rohan
-Created/Modified Date    :     27-04-2020
-Description              :     UserNameAlreadyExistException class to handle runtime exception
*******************************************************************************************************************************/

public class UserNameAlreadyExistException extends RuntimeException{

	public UserNameAlreadyExistException(String message)
	{
		super(message);
	}
	public UserNameAlreadyExistException()
	{
		super();
	}
}
