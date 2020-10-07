package Reusables;

import org.openqa.selenium.WebDriver;

import pageObjectsRepo.ShoppingcartpageRepo;

public class ShoppingcartpageActions extends ShoppingcartpageRepo {

	public ShoppingcartpageActions(WebDriver driver) {
		super(driver);
		System.out.println("driver : " + driver);
	}

	public void searchTerm(String SearchTerm){
		
		
	}
	

}
