package tests;

import static org.testng.Assert.assertTrue;
import static utils.Timers.getDurationInMillisFrom;
import static utils.Timers.setTimestamp;

import org.testng.Reporter;
import org.testng.annotations.Test;

import base.BaseTest;
import lombok.extern.slf4j.Slf4j;
import pages.BrokenImagesPage;

@Slf4j
public class BrokenImagesTests extends BaseTest{
	@Test(groups = "end2end")
    public void testSuccessfulAdd(){
    	
    	//Start timer
        setTimestamp("testBrokenImages");
        
        BrokenImagesPage brokenImages = homePage.clickBrokenImages();
        
        Reporter.log("Go to broken images page");
        log.debug("Once before all tests within this class");
        
        assertTrue(brokenImages.findAllBrokenImages().equals(2)
                , "All broken images were found");
        
        //Report duration
        Reporter.log("Test duration: " + getDurationInMillisFrom("testBrokenImages") + " ms");
        
        //Log duration
        log.debug(Long.toString(getDurationInMillisFrom("testBrokenImages")));
        System.out.println(getDurationInMillisFrom("testBrokenImages"));
        long maxDuration = 2000L;
        
        assertTrue(maxDuration >= getDurationInMillisFrom("testBrokenImages"));
    }
}
