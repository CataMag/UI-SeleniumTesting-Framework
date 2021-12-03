package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EntryAdPage {
	
	private WebDriver driver;
	private By modalAd = By.cssSelector("div#modal > .modal");
	private By modalAdClose = By.cssSelector(".modal-footer > p");
	private By enableAdModal = By.cssSelector("a#restart-ad");
	private By entryAdLink = By.linkText("Entry Ad");
	
	public EntryAdPage(WebDriver driver) {
        this.driver = driver;
    }
	
	public boolean closeAdWindow() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(modalAd));
		driver.findElement(modalAdClose).click();
		return !driver.findElement(modalAd).isDisplayed();
	}
	
	public boolean showAdWindowSecondTime() {
		WebDriverWait waitFirstTime = new WebDriverWait(driver, 10);
		waitFirstTime.until(ExpectedConditions.visibilityOfElementLocated(modalAd));
		driver.findElement(modalAdClose).click();
		
		WebDriverWait waitEnable = new WebDriverWait(driver, 10);
		waitEnable.until(ExpectedConditions.visibilityOfElementLocated(enableAdModal));
		driver.findElement(enableAdModal).click();
		
		while(!driver.findElement(modalAd).isDisplayed()) {
			sleep(3000);
			if(driver.findElement(modalAd).isDisplayed()) break;
			driver.findElement(enableAdModal).click();
		}
		
		return driver.findElement(modalAd).isDisplayed();
	}

	private void sleep(int x) {
		try {
			Thread.sleep(x);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
