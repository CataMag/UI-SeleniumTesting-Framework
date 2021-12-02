package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrokenImagesPage {
	private WebDriver driver;
	
	public BrokenImagesPage(WebDriver driver) {
        this.driver = driver;
    }
	
	public Integer findAllBrokenImages() {
		Integer counterBrokenImages = 0;
		List<WebElement> listImages = driver.findElements(By.tagName("img"));
	    
	    for(WebElement image : listImages) {
	    	if(image != null) {
	    		if(image.getAttribute("naturalWidth").equals("0")) counterBrokenImages++;
	    	}
	    }
	    
	    return counterBrokenImages;
	}
}
