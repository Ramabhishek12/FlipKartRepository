package genericLibraries;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtilities {
	//handling drop-down
	public void dropDown(WebElement ele,String option) {
		Select sel=new Select(ele);
		sel.selectByVisibleText(option);
	}
	//handling mouse hover
	public void mouseHover(WebDriver driver,WebElement ele) {
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
	}
	//handling double click
	public void doubleClick(WebDriver driver,WebElement ele) {
		Actions act=new Actions(driver);
		act.doubleClick(ele).perform();
	}
	//handling right click
	public void rightClick(WebDriver driver,WebElement ele) {
		Actions act=new Actions(driver);
		act.contextClick(ele).perform();
	}
	//handling drag and drop
	public void dragAndDrop(WebDriver driver,WebElement src,WebElement dest) {
		Actions act=new Actions(driver);
		act.dragAndDrop(src, dest).perform();
	}
	//switching to 0th frame
	public void switchinTo0thFrame(WebDriver driver) {
		driver.switchTo().frame(0);
	}
	//switching back to original frame
	public void switchBackToOriginalFrame(WebDriver driver) {
		driver.switchTo().defaultContent();
	}
	//handling accepting alertPopup
	public void acceptAlertPopUp(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	//handling dismissing alertPopup
	public void rejectAlertPopUp(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}
	//handling switching tab
	public void switchTab(WebDriver driver) {
		//tabs list contains addresses of parent as well as children window addresses
		Set<String> tabs = driver.getWindowHandles();
		for(String itr:tabs) {
			driver.switchTo().window(itr);
		}
	}
	//handling scroll bar
	public void scrollBar(WebDriver driver,WebElement ele) {
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		Point p=ele.getLocation();
		int x=p.getX();
		int y=p.getY();
		jse.executeScript("widow.scrollBy("+x+","+y+")");
	}
}
