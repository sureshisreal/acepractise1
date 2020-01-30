package pageObjectsRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.BaseTest;

public class CategorypoageRepo extends BaseTest {

	public CategorypoageRepo(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//button[@class='btn grey-btn WEbtn']")
	public WebElement ShopNow;

	@FindBy(xpath = "//input[@id='SimpleSearchForm_SearchTerm']")
	public WebElement Search1;

	@FindBy(xpath = "//input[@id='SimpleSearchForm_SearchTerm']")
	public WebElement Search;

	@FindBy(xpath = "//a[@id='autoSelectOption_0']")
	public WebElement SearchFirst;

	@FindBy(xpath = "//a[@id='WC_CatalogEntryDBThumbnailDisplayJSPF_222156_link_9b']")
	public WebElement FirstProduct;

}
