package tests;

import static org.testng.Assert.assertTrue;
import static utils.Timers.getDurationInMillisFrom;
import static utils.Timers.setTimestamp;

import org.testng.Reporter;
import org.testng.annotations.Test;

import base.BaseTest;
import lombok.extern.slf4j.Slf4j;
import pages.EntryAdPage;

@Slf4j
public class EntryAdTests extends BaseTest{
	
	@Test(groups = "end2end")
	public void testSuccessfulCloseAd(){
    	
    	//Start timer
        setTimestamp("testSuccessfulCloseAd");
        
        EntryAdPage entryAdPage = homePage.clickEntryAd();
        
        Reporter.log("Go to entry ad page");
        log.debug("Once before all tests within this class");
        
        assertTrue(entryAdPage.closeAdWindow()
                , "Ad window successfully closed");
        
        //Report duration
        Reporter.log("Test duration: " + getDurationInMillisFrom("testSuccessfulCloseAd") + " ms");
        
        //Log duration
        log.debug(Long.toString(getDurationInMillisFrom("testSuccessfulCloseAd")));
        System.out.println(getDurationInMillisFrom("testSuccessfulCloseAd"));
        long maxDuration = 2000L;
        
        assertTrue(maxDuration >= getDurationInMillisFrom("testSuccessfulCloseAd"));
    }
	
	 @Test(groups = "end2end")
	    public void testSuccessfulEnableAd(){
		 EntryAdPage entryAdPage = homePage.clickEntryAd();
	    	assertTrue(entryAdPage.showAdWindowSecondTime()
	                , "Ad window was shown the 2nd time successfully");
	    }
}
