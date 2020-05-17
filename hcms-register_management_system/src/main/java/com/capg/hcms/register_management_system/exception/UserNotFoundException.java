package com.capg.hcms.register_management_system.exception;

/*******************************************************************************************************************************
-Author                   :     Boola Rohan, ManikantaReddy
-Created/Modified Date    :     27-04-2020
-Description              :     UserNotFoundException class to handle runtime exception
*******************************************************************************************************************************/

public class UserNotFoundException extends RuntimeException{

	public UserNotFoundException(String message)
	{
		super(message);
	}
	public UserNotFoundException()
	{
		super();
	}
}
