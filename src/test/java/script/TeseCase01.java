package script;

import java.io.IOException;


import org.testng.annotations.Test;

import genericLibraries.BaseClass;
import pomPages.HomePage;
import pomPages.LoginPage;

public class TeseCase01 extends BaseClass{
	@Test
	public void LoginScript() throws IOException, InterruptedException {
		
		LoginPage lp=new LoginPage(driver);
		lp.enterEmailOrNumber();
		lp.enterPassword();
		lp.clickOnLoginBTN();
		
		HomePage hp=new HomePage(driver);
		hp.enterKeyToSearch();
		hp.clickOnSearchBTN();
	}
}
