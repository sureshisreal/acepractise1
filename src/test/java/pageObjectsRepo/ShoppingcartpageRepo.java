package pageObjectsRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.BaseTest;

public class ShoppingcartpageRepo extends BaseTest {

	public ShoppingcartpageRepo(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//input[@id='account1_1']")
	public WebElement Visa;

	@FindBy(xpath = "//input[@id='cardHolderName']")
	public WebElement CardName;

	@FindBy(xpath = "//input[@id='cc_cvc_1']")
	public WebElement CVV;

	@FindBy(xpath = "//button[@id='btn_proceed_to_order_review']")
	public WebElement ReviewOrder;

	@FindBy(xpath = "//button[@class='btn btn-primary close-button']")
	public WebElement Close;

	@FindBy(xpath = "//li[@class='logoimg']//img[@class='img-responsive']")
	public WebElement Logo;

	@FindBy(xpath = "//span[@id='Header_GlobalLogin_signOutQuickLinkUser']")
	public WebElement MyAccountLink;

	@FindBy(xpath = "//a[@id='Header_GlobalLogin_loggedInDropdown_SignOut']")
	public WebElement SignOut;

}
