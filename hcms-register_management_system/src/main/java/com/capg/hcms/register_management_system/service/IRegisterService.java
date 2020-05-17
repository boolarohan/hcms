package com.capg.hcms.register_management_system.service;



import com.capg.hcms.register_management_system.model.User;
import com.capg.hcms.register_management_system.model.UserList;


/*******************************************************************************************************************************
-Author                   :     Boola Rohan, Manikanta Reddy
-Created/Modified Date    :     01-05-2020
-Description              :     IRegisterervice Interface with services for Register Management System
*******************************************************************************************************************************/


public interface IRegisterService {
	
	User registerUser(User user);
	
	User getUser(String userId);
	
	UserList getAllUsers();
	
	User validateUser(String userName,String userPassword); 
	
	boolean removeAllUsers();
	
	boolean removeUserById(String userId);
}

