package tests;

import static org.testng.Assert.assertTrue;
import static utils.Timers.getDurationInMillisFrom;
import static utils.Timers.setTimestamp;

import org.testng.Reporter;
import org.testng.annotations.Test;

import base.BaseTest;
import lombok.extern.slf4j.Slf4j;
import pages.DynamicLoadingPage;

@Slf4j
public class DynamicLoadingTests extends BaseTest{

	@Test(groups = "end2end")
    public void testExample1(){
    	
    	//Start timer
        setTimestamp("testExample1");
        
        DynamicLoadingPage dynamicLoadingPage = homePage.clickDynamicLoading();
        
        Reporter.log("Go to dynamic loading page");
        log.debug("Once before all tests within this class");
        
        assertTrue(dynamicLoadingPage.example1Wait()
                , "Hello world in example 1 was showed");
        
        //Report duration
        Reporter.log("Test duration: " + getDurationInMillisFrom("testExample1") + " ms");
        
        //Log duration
        log.debug(Long.toString(getDurationInMillisFrom("testExample1")));
        System.out.println(getDurationInMillisFrom("testExample1"));
        long maxDuration = 10000L;
        
        assertTrue(maxDuration >= getDurationInMillisFrom("testExample1"));
    }
	
	@Test(groups = "end2end")
    public void testExample2(){
		DynamicLoadingPage dynamicLoadingPage = homePage.clickDynamicLoading();
		assertTrue(dynamicLoadingPage.example2Wait()
                , "Hello world in example 2 was showed");
    }
	
}
