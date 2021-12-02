package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddRemElemPage {
	
	private WebDriver driver;
	private By addButton = By.cssSelector("button"); 
	private By deleteButton = By.xpath("//div[@id='elements']/button[@class='added-manually']");
	
	public AddRemElemPage(WebDriver driver) {
        this.driver = driver;
    }
	
	public boolean clickAddButton(){
        driver.findElement(addButton).click();
        return driver.findElement(deleteButton).isDisplayed();
    }
	
	public boolean clickDeleteButton(){
		driver.findElement(addButton).click();
		boolean displayDelete = true;
        if(driver.findElement(deleteButton).isDisplayed()) {
        	driver.findElement(deleteButton).click();
        	displayDelete = false;
        }
        return displayDelete;
    }
}
