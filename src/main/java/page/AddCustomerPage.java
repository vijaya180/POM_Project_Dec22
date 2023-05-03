package page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AddCustomerPage extends BasePage{
	WebDriver driver;
	public AddCustomerPage(WebDriver driver) {
		this.driver= driver;
	}
	//web element
	@FindBy(how = How.XPATH,using= "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div/div[1]/h5") WebElement ADD_CUSTOMER_HEADER_ELEMENT;
	@FindBy(how = How.XPATH,using= "//*[@id=\"account\"]") WebElement FULL_NAME_ELEMENT;
	@FindBy(how = How.XPATH,using= "//*[@id=\"cid\"]") WebElement COMPANY_ELEMENT;
	@FindBy(how = How.XPATH,using= "//*[@id=\"email\"]") WebElement EMAIL_ELEMENT;
	@FindBy(how = How.XPATH,using= "//*[@id=\"phone\"]") WebElement PHONE_ELEMENT;
	@FindBy(how = How.XPATH,using= "//*[@id=\"address\"]") WebElement ADDRESS_ELEMENT;
	@FindBy(how = How.XPATH,using= "//*[@id=\"city\"]") WebElement CITY_ELEMENT;
	@FindBy(how = How.XPATH,using= "//*[@id=\"state\"]") WebElement STATE_ELEMENT;
	@FindBy(how = How.XPATH,using= "//*[@id=\"zip\"]") WebElement ZIP_ELEMENT;
	@FindBy(how = How.XPATH,using= "//*[@id=\"country\"]") WebElement COUNTRY_ELEMENT;
	
	public void validateAddCustomerPage() {
		
		waitForElement(driver,5,ADD_CUSTOMER_HEADER_ELEMENT);
		Assert.assertEquals(ADD_CUSTOMER_HEADER_ELEMENT.getText(), "Add Contact", "AddContact Page is not found!!!");
	}
	
	

	public void insertFullName(String fullname) {
		String insertedName = fullname + generateRandomNum(999);
		FULL_NAME_ELEMENT.sendKeys(insertedName);
	}
	
	public void selectCompanyName(String company) {
		selectFromDropdown(COMPANY_ELEMENT,company);
	}
	
	public void insertEmail(String email) {
		EMAIL_ELEMENT.sendKeys(generateRandomNum(999)+email);
	}
	public void insertPhoneNum(String phone) {
		PHONE_ELEMENT.sendKeys(phone + generateRandomNum(999));
	}
	public void selectCountry(String country) {
		selectFromDropdown( COUNTRY_ELEMENT, country);
	}
}
