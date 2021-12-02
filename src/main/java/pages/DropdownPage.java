package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DropdownPage {
	private WebDriver driver;
	private By dropdownMenu = By.id("dropdown");
	private By dropdownMenuOption1 = By.xpath("//*[@id=\"dropdown\"]/option[2]");
	private By dropdownMenuOption2 = By.xpath("//*[@id=\"dropdown\"]/option[3]");

	public DropdownPage(WebDriver driver) {
        this.driver = driver;
    }
	
	public String getSelectOption1(){
        driver.findElement(dropdownMenu).click();
        driver.findElement(dropdownMenuOption1).click();
        if(driver.findElement(dropdownMenuOption1).isSelected()) {
        	return driver.findElement(dropdownMenuOption1).getText();
        }
        return null;
    }
	
	public String getSelectOption2(){
		driver.findElement(dropdownMenu).click();
        driver.findElement(dropdownMenuOption2).click();
        if(driver.findElement(dropdownMenuOption2).isSelected()) {
        	return driver.findElement(dropdownMenuOption2).getText();
        }
        return null;
    }
}
