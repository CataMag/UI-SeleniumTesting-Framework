package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicLoadingPage {
	private WebDriver driver;
	private By example1 = By.cssSelector("div#content > div > a:nth-of-type(1)");
	private By example2 = By.cssSelector("div > a:nth-of-type(2)");
	private By exampleStart = By.cssSelector("div#start > button");
	private By helloWorldExample = By.cssSelector("div#finish > h4");
	
	public DynamicLoadingPage(WebDriver driver) {
        this.driver = driver;
    }
	
	public boolean example1Wait() {
		driver.findElement(example1).click();
		driver.findElement(exampleStart).click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(helloWorldExample));
		return driver.findElement(helloWorldExample).isDisplayed();
	}
	
	public boolean example2Wait() {
		driver.findElement(example2).click();
		driver.findElement(exampleStart).click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(helloWorldExample));
		return driver.findElement(helloWorldExample).isDisplayed();
	}
}
