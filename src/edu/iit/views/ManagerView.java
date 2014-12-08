package edu.iit.views;

import edu.iit.controller.SectionService;
import edu.iit.model.Section;

public class ManagerView {
	
	public void getBooksPerSection(){
		SectionService.countBooksPerSection(new Section());
	}

}
