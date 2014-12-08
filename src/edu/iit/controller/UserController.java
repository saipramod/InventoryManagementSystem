package edu.iit.controller;

import java.util.HashMap;

import edu.iit.model.User;

public class UserController {
	
	public static String determineUserRole(User user){
		return "";
	}
	public static boolean authorizeUser(User user){
		return true;
	}

	public static HashMap<User,Integer> getAuthorsRating(){
		
		return new HashMap();
	}
}
