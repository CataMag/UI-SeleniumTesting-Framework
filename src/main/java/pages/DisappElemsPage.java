package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DisappElemsPage {
	
	private WebDriver driver;
	private By homeButton = By.cssSelector("li:nth-of-type(1) > a");
	private By homeHeadingTitle = By.cssSelector("div#content > .heading");

	public DisappElemsPage(WebDriver driver) {
        this.driver = driver;
    }
	
	public boolean clickHomeButton(){
        driver.findElement(homeButton).click();
        return driver.findElement(homeHeadingTitle).isDisplayed();
    }
}
