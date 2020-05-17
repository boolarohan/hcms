package com.capg.hcms.test_management_system.exception;

/*******************************************************************************************************************************
-Author                   :     Ashritha
-Created/Modified Date    :     1/05/2020
-Description              :     ListEmptyException is thrown when the list is empty.
*******************************************************************************************************************************/
public class ListEmptyException extends RuntimeException{
	
	public ListEmptyException(String message) {
		super(message);
	}

}
