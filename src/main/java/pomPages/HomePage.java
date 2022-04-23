package pomPages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibraries.BaseClass;

public class HomePage extends BaseClass{
	@FindBy(name="q")
	private WebElement searchBox;
	@FindBy(xpath="//button[@class='L0Z3Pu']")
	private WebElement searchBTN;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enterKeyToSearch() throws IOException {
		searchBox.sendKeys(pfdata.getPropertiesData("keyToSearch"));
	}
	public void clickOnSearchBTN() {
		searchBTN.click();
	}
}
