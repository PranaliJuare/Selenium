package GenericUtils;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import ElementRepository.BasePage;
import ElementRepository.LoginPage;

public class BaseClass2 implements IAutoConstants, ITestListener {

	public static WebDriver driver;
	public FileLibrary flib;
	public BasePage bp;
	public LoginPage lp;
	public TakesScreenshot ts ;

	@BeforeSuite
	public void beforreSuite() {
		Reporter.log("Before Suite", true);
	}

	@BeforeTest
	public void beforeTest() {
		Reporter.log("Before Test", true);
	}

	@AfterSuite
	public void afterSuite() {
		Reporter.log("After Suite", true);

	}

	@AfterTest
	public void afterTest() {
		Reporter.log("After Test", true);
	}

	@Parameters("bname")
	@BeforeClass
	public void launchingBrowser(@Optional("chrome") String browserName) {

		Reporter.log("Before Class", true);
		if (browserName.equalsIgnoreCase("chrome"))
			driver = new ChromeDriver();

		else if (browserName.equalsIgnoreCase("firefox"))
			driver = new FirefoxDriver();

		else if (browserName.equalsIgnoreCase("edge"))
			driver = new EdgeDriver();

		lp = new LoginPage(driver);
		flib = new FileLibrary();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitTimeOut));
	}

	@AfterClass
	public void tearDownBrowser() {
		Reporter.log("After Class", true);
		driver.close();
		driver.quit();
	}

	@BeforeMethod
	public void beforeMethod() {
		Reporter.log("Before Method", true);
		driver.get(flib.fetchDataFromProperties(PropertyFilePath, "https://demowebshop.tricentis.com/"));
		lp.getLoginLink().click();
		lp.getEmailTextBox().sendKeys(PropertyFilePath, "email");
		lp.getPasswordTextBox().sendKeys(PropertyFilePath, "password");

	}

	@AfterMethod
	public void afterMethod() {
		Reporter.log("After Method", true);
		lp.getLogoutLink().click();
	}

	@Override
	public void onTestStart(ITestResult result) {

	}

	@Override
	public void onTestSuccess(ITestResult result) {

	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(screenshotPath+"screenshot.png");
		try {
			FileHandler.copy(src, dest);
		} catch (Exception e) {

		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {

	}
}
