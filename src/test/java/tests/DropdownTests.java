package tests;

import static org.testng.Assert.assertTrue;
import static utils.Timers.getDurationInMillisFrom;
import static utils.Timers.setTimestamp;

import org.testng.Reporter;
import org.testng.annotations.Test;

import base.BaseTest;
import lombok.extern.slf4j.Slf4j;
import pages.DropdownPage;


@Slf4j
public class DropdownTests extends BaseTest{
	
	    @Test(groups = "end2end")
	    public void testSelectOption1(){
	    	
	    	//Start timer
	        setTimestamp("testSelectOption1");
	        
	        DropdownPage dropdownPage = homePage.clickDropdown();
	        
	        Reporter.log("Go to dropdown page");
	        log.debug("Once before all tests within this class");
	        
	        assertTrue(dropdownPage.getSelectOption1().contains("Option 1")
	                , "Success select option 1!");
	        
	        //Report duration
	        Reporter.log("Test duration: " + getDurationInMillisFrom("testSelectOption1") + " ms");
	        
	        //Log duration
	        log.debug(Long.toString(getDurationInMillisFrom("testSelectOption1")));
	        System.out.println(getDurationInMillisFrom("testSelectOption1"));
	        long maxDuration = 2000L;
	        
	        assertTrue(maxDuration >= getDurationInMillisFrom("testSelectOption1"));
	    }
	    
	    @Test(groups = "end2end")
	    public void testSelectOption2(){
	    	DropdownPage dropdownPage = homePage.clickDropdown();
	    	assertTrue(dropdownPage.getSelectOption2().contains("Option 2")
	                , "Success select option 2!");
	    }
}
