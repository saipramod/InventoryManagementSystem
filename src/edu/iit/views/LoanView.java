package edu.iit.views;

import edu.iit.controller.LoanController;
import edu.iit.model.Book;
import edu.iit.model.User;

public class LoanView {
	
	public void loanView(Book book,User user){
		LoanController.loanBook(book, user);
	}

}
