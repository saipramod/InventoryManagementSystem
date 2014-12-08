package edu.iit.controller;

import edu.iit.model.Book;
import edu.iit.model.Loan;
import edu.iit.model.User;

public class BookService {
	
	public static int countBooksOnLoan(User Author){
		return 0;
	}
	public static boolean addInventory(Book book){
		return true;
	}

	public static boolean markAsExpired(Book book){
		return true;
	}
	
	public static Loan checkBarCode(String barcode){
		return new Loan();
	}

}
