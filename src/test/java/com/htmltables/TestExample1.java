package com.htmltables;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

import com.utils.BaseUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class TestExample1 extends BaseUtils {
    // example on page 87 from learning selenium testing

    @BeforeClass(alwaysRun = true)
    public void launchBrowers(ITestContext context) throws Exception {
        driver.navigate().to("http://book.theautomatedtester.co.uk/chapter1");
    }

    @Test(priority = 10)
    public void testFindElements() {
        //driver.findElement(By.id("verifybutton"));

        List<WebElement> elements = driver.findElements(By.id("verifybutton"));
        Assert.assertEquals(1, elements.size());
    }



    //    @AfterTest(alwaysRun = true)
    //    public void terminateApp() {
    //        tearDown();
    //    }

}
