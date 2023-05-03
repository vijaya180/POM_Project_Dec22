package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {
	WebDriver driver;
	//test / mock data
	String userName="demo@techfios.com";
	String password="abc123";
	String fullName = "Selenium";
	String company = "Techfios";
	String email = "demo@techfios.com";
	String country = "Algeria";
	@Test
	public void userShouldBeAbleToLogin() {
		//by name of the class or object to call the method
		//login page
		driver=BrowserFactory.init();
		//LoginPage loginpage1 = new LoginPage(driver);
		LoginPage loginpage= PageFactory.initElements(driver, LoginPage.class);
		loginpage.insertUserName(userName);
		loginpage.insertPassword(password);
		loginpage.clickOnSigninButton();
		
		DashboardPage dashboardpage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardpage.validateDashboardPage();
		
		BrowserFactory.tearDown();
	}
}
