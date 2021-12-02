package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By formAuthenticationLink = By.linkText("Form Authentication");
    private By checkboxesLink = By.linkText("Checkboxes"); 
    private By addRemElemLink = By.linkText("Add/Remove Elements");
    private By dropdownLink = By.linkText("Dropdown");
    private By brokenImagesLink = By.linkText("Broken Images");
    private By disappElemLink = By.linkText("Disappearing Elements");
    private By dynamicLoadingLink = By.linkText("Dynamic Loading");
    
    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public  LoginPage clickFormAuthentication(){
        driver.findElement(formAuthenticationLink).click();
        return new LoginPage(driver);
    }

	public CheckboxesPage clickCheckboxes() {
		driver.findElement(checkboxesLink).click();
        return new CheckboxesPage(driver);
	}
	
	public AddRemElemPage clickAddRemElem() {
		driver.findElement(addRemElemLink).click();
        return new AddRemElemPage(driver);
	}
	
	public DropdownPage clickDropdown() {
		driver.findElement(dropdownLink).click();
        return new DropdownPage(driver);
	}
	
	public BrokenImagesPage clickBrokenImages() {
		driver.findElement(brokenImagesLink).click();
        return new BrokenImagesPage(driver);
	}
	
	public DisappElemsPage clickDisappElem() {
		driver.findElement(disappElemLink).click();
        return new DisappElemsPage(driver);
	}
	
	public DynamicLoadingPage clickDynamicLoading() {
		driver.findElement(dynamicLoadingLink).click();
        return new DynamicLoadingPage(driver);
	}
}
