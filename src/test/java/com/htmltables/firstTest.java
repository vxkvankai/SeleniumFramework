package com.htmltables;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.utils.BaseUtils;


public class firstTest extends BaseUtils {

    @BeforeClass(alwaysRun = true)
    public void launchBrowsers(ITestContext context) throws Exception {

        setDriver();
        //You can call NavigatToUrl() if you set the baseurl in testng.xml
        //NavigatToUrl();
        //or you can call navigate.to directuly like below
        driver.navigate().to("http://demo.guru99.com/selenium/newtours");

    }


    @Test(priority = 10)
    public void TestTitle() {

        String expectedTitle = "Welcome: Mercury Tours";
        //I would just call assert here and let the assert and testng frame tell you if the test failed.
        Assert.assertEquals(driver.getTitle(), expectedTitle);

        //        or the text book way of just system.out, you don't have to do, assert is better programming as above.
        //        if (driver.getTitle().contentEquals(expectedTitle)) {
        //            System.out.println("Test Passed!");
        //        } else {
        //            System.out.println("Test Failed");
        //        }

    }

    @AfterClass(alwaysRun = true)
    public void terminateApp() {
        tearDown();
    }

}
