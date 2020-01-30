package pageObjectsRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.BaseTest;

public class PdppageRepo extends BaseTest {

	public PdppageRepo(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//a[@id='swatch_link_entitledItem_222156_XS']//span[@class='color_swatch'][contains(text(),'XS')]")
	public WebElement SelectSize;

	@FindBy(xpath = "//div[@id='productPageAdd2Cart']")
	public WebElement AddtoBag;

	@FindBy(xpath = "//button[@id='viewCartBtn']")
	public WebElement Cart;

	@FindBy(xpath = "//button[@id='start_checkout_bottom']")
	public WebElement ContinueCheckout;

	@FindBy(xpath = "//button[@class='proceed-to-payment-button btn btn-primary']")
	public WebElement ProceedToPayment;

}
