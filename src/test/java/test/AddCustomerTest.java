package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class AddCustomerTest {
	WebDriver driver;
	//Test/Mock data
	String userName="demo@techfios.com";
	String password="abc123";
	String fullName = "Selenium";
	String company = "Techfios";
	String email = "demo@techfios.com";
	String phone = "1234567";
	String country = "Algeria";
	@Test
	public void userShouldBeAbleToAddCustomer() {
		driver = BrowserFactory.init();
		LoginPage loginpage= PageFactory.initElements(driver, LoginPage.class);
		/*loginpage.insertUserName(userName);
		loginpage.insertPassword(password);*/
		//loginpage.clickOnSigninButton();
		loginpage.login(userName,password);
		DashboardPage dashboardPage= PageFactory.initElements(driver,DashboardPage.class);
		dashboardPage.validateDashboardPage();
		dashboardPage.clickOnCustomerMenu();
		dashboardPage.clickOnAddCustomerMenuElement();
		
		AddCustomerPage addCustomerPage = PageFactory.initElements(driver, AddCustomerPage.class);
		addCustomerPage.validateAddCustomerPage();
		addCustomerPage.insertFullName(fullName);
		addCustomerPage.selectCompanyName(company);
		addCustomerPage.insertEmail(email);
		addCustomerPage.insertPhoneNum(phone);
		addCustomerPage.selectCountry(country);
	}
	
	
}
