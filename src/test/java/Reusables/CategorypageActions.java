package Reusables;

import org.openqa.selenium.WebDriver;

import pageObjectsRepo.CategorypoageRepo;

public class CategorypageActions extends CategorypoageRepo {

	public CategorypageActions(WebDriver driver) {
		super(driver);
		System.out.println("driver : " + driver);
	}

	public void searchTerm(String SearchTerm){
		
		
	}
	

}
