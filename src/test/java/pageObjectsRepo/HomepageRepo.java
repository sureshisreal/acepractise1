package pageObjectsRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.BaseTest;

public class HomepageRepo extends BaseTest {

	public HomepageRepo(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//span[@id='signedText']")
	public WebElement MyAccount;

	@FindBy(xpath = "//span[contains(text(),'Create an account')]")
	public WebElement CreateAccount;

	@FindBy( = "//input[@id='Header_GlobalLogin_WC_AccountDisplay_FormInput_logonId_In_Logon_1']")
	public WebElement LogonID;

	@FindBy( = "//input[@id='Header_GlobalLogin_WC_AccountDisplay_FormInput_logonPassword_In_Logon_1']")
	public WebElement Password;

	@FindBy(xpath = "//a[@id='Header_GlobalLogin_WC_AccountDisplay_links_2']")
	public WebElement SignIn;

	@FindBy(xpath = "//button[@class='offer-control close']")
	public WebElement NewsLetterClose;
	
	@FindBy(id = "fcopt-offer-55248-content")
	public WebElement Newspopup;
	

	public WebElement Brands_RandomCategory(int i) {
		return driver.findElement(By.xpath("(.//*[@class='brandListing column-list-js']//a)[" + i + "]"));
	}
}
