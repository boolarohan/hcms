package com.capg.hcms.appointment_management_system.exceptions;

/*******************************************************************************************************************************
-Author                   :     Rishita Kalidindi
-Created/Modified Date    :     27-04-2020
-Description              :     AppointmentNotFoundException class to handle runtime exception
*******************************************************************************************************************************/

public class AppointmentNotFoundException extends RuntimeException {


	public AppointmentNotFoundException(String message) {
		super(message);
	}

	
}
