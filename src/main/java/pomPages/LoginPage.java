package pomPages;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibraries.BaseClass;

public class LoginPage extends BaseClass{
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement emailOrNumber;
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	@FindBy(xpath="(//span[text()='Login'])[2]")
	private WebElement loginBTN;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enterEmailOrNumber() throws IOException {
		String email=pfdata.getPropertiesData("email");
		emailOrNumber.sendKeys(email);
	}
	public void enterPassword() throws IOException {
		String pass=pfdata.getPropertiesData("pass");
		password.sendKeys(pass);
	}
	public void clickOnLoginBTN() {
		loginBTN.click();
	}
}
