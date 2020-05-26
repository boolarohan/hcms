package com.capg.hcms.register_management_system.service;


import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.hcms.register_management_system.exception.ContactNumberAlreadyExistException;
import com.capg.hcms.register_management_system.exception.EmailAlreadyExistException;
import com.capg.hcms.register_management_system.exception.UserNameAlreadyExistException;
import com.capg.hcms.register_management_system.exception.UserNotFoundException;
import com.capg.hcms.register_management_system.model.User;
import com.capg.hcms.register_management_system.model.UserList;
import com.capg.hcms.register_management_system.repository.IRegisterRepository;

/*******************************************************************************************************************************
-Author                   :     Boola Rohan
-Created/Modified Date    :     01-05-2020
-Description              :     RegisterServiceImp Class implements services for Register Management System
*******************************************************************************************************************************/

@Service
public class RegisterServiceImpl implements IRegisterService{

	@Autowired
	private IRegisterRepository registerRepo;
	@Autowired
	private Random random;
	
	String errorMessage=" is Already Exist";
	
	/*********************************************************************************************************************************
	-Function Name            :     registerUser
	-Input Parameters         :     user Object
	-Return Type              :     user object
	-Throws                   :     UserNameAlreadyExistException, ContactNumberAlreadyExistException, EmailAlreadyExistException
	-Author                   :     Boola Rohan
	-Created/Modified Date    :     04-05-2020
	-Description              :     register user with user name, contact number and emailId to the register database table 
	***********************************************************************************************************************************/
	
	@Override
	public User registerUser(User user) {
		
		user.setUserId(Integer.toString(random.nextInt(1000000)));
		
		if(registerRepo.getUserByUserName(user.getUserName())!=null)
			throw new UserNameAlreadyExistException("User with Name "+user.getUserName()+errorMessage);
		
		if(registerRepo.getUserByContactNumber(user.getContactNumber())!=null)
			throw new ContactNumberAlreadyExistException("User with ContactNumber "+user.getContactNumber()+errorMessage);
		
		if(registerRepo.getUserByUserEmail(user.getUserEmail())!=null)
			throw new EmailAlreadyExistException("User with Email "+user.getUserEmail()+errorMessage);
	
		return registerRepo.save(user);
	}
	
	/*********************************************************************************************************************************
	-Function Name            :     getUser
	-Input Parameters         :     String userId
	-Return Type              :     String userId
	-Throws                   :     UserNotFoundException
	-Author                   :     Boola Rohan
	-Created/Modified Date    :     04-05-2020
	-Description              :     get user by userId from the register database table 
	***********************************************************************************************************************************/

	@Override
	public User getUser(String userId) {
	
		if(!registerRepo.existsById(userId))
			throw new UserNotFoundException("User with id "+userId+" Not Found");
		
		return registerRepo.getOne(userId);
	
	}
	

	@Override
	public UserList getAllUsers() {
	
		return new UserList(registerRepo.findAll());
	
	}
    
	/*********************************************************************************************************************************
	-Function Name            :     validateUser
	-Input Parameters         :     String userName, String userPassword
	-Return Type              :     user
	-Throws                   :     UserNotFoundException
	-Author                   :     Boola Rohan
	-Created/Modified Date    :     04-05-2020
	-Description              :     validate user with username and password
	***********************************************************************************************************************************/
	
	@Override
	public User validateUser(String userName, String userPassword) {
        
	         User user=registerRepo.getUserByUserNameAndUserPassword(userName, userPassword);

		 if(user==null)
		 {
			 throw new UserNotFoundException("Invalid UserName and Password");
		 }
		 
		 return user;
	}

	@Override
	public boolean removeAllUsers() {
		registerRepo.deleteAll();
		return registerRepo.findAll().isEmpty();
	}
	
	@Override
	public boolean removeUserById(String userId) {
		registerRepo.deleteById(userId);
		return true;
	}
}
