package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static utils.Timers.getDurationInMillisFrom;
import static utils.Timers.setTimestamp;

import org.testng.Reporter;
import org.testng.annotations.Test;

import base.BaseTest;
import lombok.extern.slf4j.Slf4j;
import pages.CheckboxesPage;

@Slf4j
public class CheckboxesTests extends BaseTest{
	
	
	@Test(groups = "end2end")
	public void testCheckbox1Check() throws InterruptedException {
		
		//Start timer
        setTimestamp("testCheckbox1");
        
		CheckboxesPage checkboxesPage = homePage.clickCheckboxes();
		
		Reporter.log("Click checkbox 1");
        log.debug("Once before all tests within this class");
        
		assertTrue(checkboxesPage.clickCheckBox1(), 
				"Successful checkbox1 select!");
		
		//Report duration
        Reporter.log("Test duration: " + getDurationInMillisFrom("testCheckbox1") + " ms");
        
        //Log duration
        log.debug(Long.toString(getDurationInMillisFrom("testCheckbox1")));
        System.out.println(getDurationInMillisFrom("testCheckbox1"));
        long maxDuration = 2000L;
        
        assertTrue(maxDuration >= getDurationInMillisFrom("testCheckbox1"));
	}
	
	@Test(groups = "end2end")
    public void testCheckbox2Uncheck(){
		CheckboxesPage checkboxesPage = homePage.clickCheckboxes();
    	assertEquals(checkboxesPage.clickCheckBox2(), false,
				"Successful checkbox2 select!");
    }
	
	@Test(groups = "end2end")
    public void testAllCheckboxesUncheck(){
		CheckboxesPage checkboxesPage = homePage.clickCheckboxes();
    	assertTrue(checkboxesPage.uncheckAllCheckboxes(),
				"Successful uncheck all checkboxes!");
    }
	
	@Test(groups = "end2end")
    public void testAllCheckboxesCheck(){
		CheckboxesPage checkboxesPage = homePage.clickCheckboxes();
    	assertTrue(checkboxesPage.checkAllCheckboxes(),
				"Successful check all checkboxes!");
    }
}
