

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class BaseTest {
	public WebDriver driver = null;
	public static WebDriverWait wait;
	protected JavascriptExecutor js;
	
	 Workbook xlsWorkBook;

	protected HomepageActions homepage;
	protected CategorypageActions category;
	protected PdppageActions pdppage;
	protected ShoppingcartpageActions shoppingcartpage;
	protected Random rand = new Random(); 


	@BeforeMethod
	@Parameters(value = { "browsers" })
	public void beforeMethod(String browser) {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("browserName", browser);
		capabilities.setPlatform(Platform.EL_CAPITAN);
		driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),
				capabilities);
		driver.manage().window().maximize();
		driver.get("https://www.jjill.com/");
		js = (JavascriptExecutor) driver;
	

		
		homepage = PageFactory.initElements(driver, HomepageActions.class);
		
	}

	@AfterMethod
	public void afterMethod(ITestResult result) throws IOException {
		if (result.getStatus() == ITestResult.FAILURE) {
			captureScreenShot();
			System.out.println("Script failed.... !!!!" + result.getStatus());
		} 
		else {
			System.out.println("Script Pass.... !!!!" );
		}
		driver.quit();
	}


	public String captureScreenShot() {
		try {
			DateFormat df = new SimpleDateFormat("dd_MM_yy_HH_mm_ss");
			Date now = new Date();
			String filePath = System.getProperty("user.dir")
					+ "//Test-ScreenShots//" + df.format(now) + ".png";
			TakesScreenshot screen = (TakesScreenshot) driver;
			File screenShot = screen.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenShot, new File(filePath));
			return filePath;
		} catch (IOException e) {
		}
		return null;
	}
	
	public List<String> getColumnData(String sheetName, String columnName) throws IOException {
		
		 System.out.println(" " +sheetName + " " + columnName);
	        FileInputStream file = new FileInputStream(new File("TestData.xlsx"));
		xlsWorkBook = new XSSFWorkbook(file);
		Sheet sheet1 = xlsWorkBook.getSheet(sheetName);
        List<String> columnDataList = new ArrayList<String>();

        int totalNoOfRows = sheet1.getLastRowNum() - sheet1.getFirstRowNum();
        int cellNo = getCellNumber(sheetName, columnName);

        for (int i = 1; i <= totalNoOfRows; i++) {
            Row row1 = sheet1.getRow(i);
            Cell cellValue = row1.getCell(cellNo);
            if (cellValue != null) {
                cellValue.setCellType(1);
                columnDataList.add(cellValue.getStringCellValue());
            }
        }

        return columnDataList;
    }
	
	 public int getCellNumber(String sheetName, String columnName) {
	        Sheet sheet1 = xlsWorkBook.getSheet(sheetName);
	        Row row = sheet1.getRow(0);
	        for (int i = 0; i <= row.getLastCellNum(); i++) {
	            Cell cell = row.getCell(i);
	            cell.setCellType(1);
	            String cellName = cell.getStringCellValue();
	            if (cellName.equalsIgnoreCase(columnName))
	                return i;
	        }
	        return 0;
	    }

	 public void WaitUntilElementClickable(WebElement element)
	 {
	 	WebDriverWait wait=new WebDriverWait(driver, 60, 1000);
	 	wait.until(ExpectedConditions.elementToBeClickable(element));
	 }
	 
	 public void WaitUntilElementVisible(WebElement element)
	 {
	 	WebDriverWait wait=new WebDriverWait(driver, 60, 1000);
	 	wait.until(ExpectedConditions.visibilityOf(element));
	 }
	 
	 
} // Completed 
