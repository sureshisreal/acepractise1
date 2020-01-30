package Reusables;

import org.openqa.selenium.WebDriver;

import pageObjectsRepo.PdppageRepo;

public class PdppageActions extends PdppageRepo {

	public PdppageActions(WebDriver driver) {
		super(driver);
		System.out.println("driver : " + driver);
	}

	public void searchTerm(String SearchTerm){
		
		
	}
	

}
