package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static utils.Timers.getDurationInMillisFrom;
import static utils.Timers.setTimestamp;

import org.testng.Reporter;
import org.testng.annotations.Test;

import base.BaseTest;
import lombok.extern.slf4j.Slf4j;
import pages.AddRemElemPage;

@Slf4j
public class AddRemElemTests extends BaseTest{
	
	    @Test(groups = "end2end")
	    public void testSuccessfulAdd(){
	    	
	    	//Start timer
	        setTimestamp("testSuccessfulAdd");
	        
	        AddRemElemPage addRemElemPage = homePage.clickAddRemElem();
	        
	        Reporter.log("Go to add/remove page");
	        log.debug("Once before all tests within this class");
	        
	        assertTrue(addRemElemPage.clickAddButton()
	                , "Delete button created");
	        
	        //Report duration
	        Reporter.log("Test duration: " + getDurationInMillisFrom("testSuccessfulAdd") + " ms");
	        
	        //Log duration
	        log.debug(Long.toString(getDurationInMillisFrom("testSuccessfulAdd")));
	        System.out.println(getDurationInMillisFrom("testSuccessfulAdd"));
	        long maxDuration = 2000L;
	        
	        assertTrue(maxDuration >= getDurationInMillisFrom("testSuccessfulAdd"));
	    }
	    
	    @Test(groups = "end2end")
	    public void testSuccessfulDelete(){
	    	AddRemElemPage addRemElemPage = homePage.clickAddRemElem();
	    	assertEquals(addRemElemPage.clickDeleteButton(), false
	                , "Delete button erased");
	    }
}
