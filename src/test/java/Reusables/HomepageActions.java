package Reusables;

import static org.testng.AssertJUnit.assertTrue;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import pageObjectsRepo.HomepageRepo;

public class HomepageActions extends HomepageRepo {

	public HomepageActions(WebDriver driver) {
		super(driver);
	}


	public void login() {
		LogonID =  "siriusindiachrome@yopmail.com" ;
		Password = "Sirius123" ;
		MyAccount.click();
		WaitUntilElementClickable(LogonID);
		captureScreenShot();
		LogonID.clear();
		LogonID.sendKeys();
		Password.clear();
		Password.sendKeys();
		SignIn.click();
		captureScreenShot();
	}
	

}
