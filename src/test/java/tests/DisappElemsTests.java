package tests;

import static org.testng.Assert.assertTrue;
import static utils.Timers.getDurationInMillisFrom;
import static utils.Timers.setTimestamp;

import org.testng.Reporter;
import org.testng.annotations.Test;

import base.BaseTest;
import lombok.extern.slf4j.Slf4j;
import pages.DisappElemsPage;

@Slf4j
public class DisappElemsTests extends BaseTest{
	
	@Test(groups = "end2end")
    public void testSuccessfulHome(){
    	
    	//Start timer
        setTimestamp("testSuccessfulHome");
        
        DisappElemsPage disappElemsPage = homePage.clickDisappElem();
        
        Reporter.log("Go to disappearing elements page");
        log.debug("Once before all tests within this class");
        
        assertTrue(disappElemsPage.clickHomeButton()
                , "Succesfully returned to homepage");
        
        //Report duration
        Reporter.log("Test duration: " + getDurationInMillisFrom("testSuccessfulHome") + " ms");
        
        //Log duration
        log.debug(Long.toString(getDurationInMillisFrom("testSuccessfulHome")));
        System.out.println(getDurationInMillisFrom("testSuccessfulHome"));
        long maxDuration = 2000L;
        
        assertTrue(maxDuration >= getDurationInMillisFrom("testSuccessfulHome"));
    }
}
