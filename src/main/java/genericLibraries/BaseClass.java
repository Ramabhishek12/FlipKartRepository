package genericLibraries;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public WebDriver driver;
	public WebDriverUtilities webdriverutilities=new WebDriverUtilities();
	public PropertiesFile pfdata=new PropertiesFile();
	
	
	@BeforeMethod
	public void openApp() throws IOException {
		
		//WebDriverManager.firefoxdriver().setup();
		//driver=new FirefoxDriver();
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get(pfdata.getPropertiesData("url"));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void closeApp(ITestResult result) throws IOException {
		int status=result.getStatus();
		String name=result.getName();
		if(status==2) {
			ScreenShot sct=new ScreenShot();
			sct.getScreenShot(driver, name);
		}
		driver.quit();
	}
}
