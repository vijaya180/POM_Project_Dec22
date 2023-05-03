package page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	public int generateRandomNum(int boundaryNum) {
		Random rnd = new Random();
		return rnd.nextInt(boundaryNum);
	}
	public void waitForElement(WebDriver driver, int timeInSeconds, WebElement element) {
		// TODO Auto-generated method stub
		WebDriverWait wait =new WebDriverWait(driver, timeInSeconds);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	public void selectFromDropdown(WebElement element, String visibleText) {
		Select sel = new Select(element);
		sel.selectByVisibleText(visibleText);
	}
}
