package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckboxesPage {
	private WebDriver driver;
    private By checkbox1 = By.cssSelector("form#checkboxes > input:nth-of-type(1)");
    private By checkbox2 = By.cssSelector("form#checkboxes > input:nth-of-type(2)");
    
    public CheckboxesPage(WebDriver driver) {
        this.driver = driver;
    }
    
    public boolean clickCheckBox1(){
        driver.findElement(checkbox1).click();
        return driver.findElement(checkbox1).isSelected();
    }
    
    public boolean clickCheckBox2(){
        driver.findElement(checkbox2).click();
        return driver.findElement(checkbox2).isSelected();
    }
    
    public boolean uncheckAllCheckboxes() {
    	if(driver.findElement(checkbox1).isSelected()) {
    		driver.findElement(checkbox1).click();
    	}
    	
    	if(driver.findElement(checkbox2).isSelected()) {
    		driver.findElement(checkbox2).click();
    	}
    	
    	if(driver.findElement(checkbox1).isSelected() || driver.findElement(checkbox2).isSelected()) return false;
    	return true;
    }
    
    public boolean checkAllCheckboxes() {
    	if(!driver.findElement(checkbox1).isSelected()) {
    		driver.findElement(checkbox1).click();
    	}
    	
    	if(!driver.findElement(checkbox2).isSelected()) {
    		driver.findElement(checkbox2).click();
    	}
    	
    	if(driver.findElement(checkbox1).isSelected() && driver.findElement(checkbox2).isSelected()) return true;
    	return false;
    }
}
