package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class DashboardPage {
	
	WebDriver driver;
	public DashboardPage(WebDriver driver) {
		this.driver= driver;
	}
	//web element
	@FindBy(how = How.XPATH,using= "//h2[text()=' Dashboard ']") WebElement DASHBOARD_HEADER_ELEMENT;
	@FindBy(how = How.XPATH,using= "//*[@id=\"side-menu\"]/li[3]/a/span[1]") WebElement CUSTOMER_MENU_ELEMENT;
	@FindBy(how = How.XPATH,using= "//*[@id=\"side-menu\"]/li[3]/ul/li[1]/a") WebElement ADD_CUSTOMER_ELEMENT;
	
	
	//intractable method
	public void validateDashboardPage() {
		Assert.assertEquals(DASHBOARD_HEADER_ELEMENT.getText(), "Dashboard", "Dashboard page is not found");
		
	}
	public void clickOnCustomerMenu() {
		CUSTOMER_MENU_ELEMENT.click();
	}
	public void clickOnAddCustomerMenuElement() {
		ADD_CUSTOMER_ELEMENT.click();
	}
}
