package edu.iit.views;

import edu.iit.controller.UserController;
import edu.iit.model.User;

public class IndexView {
	
	public void login(){
		UserController.determineUserRole(new User());
		UserController.authorizeUser(new User());
	}

}
