package com.htmltables;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

import com.utils.BaseUtils;
import com.utils.TestngContext;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class TestExample1 extends BaseUtils {
    // example on page 87 from learning selenium testing

    @BeforeClass(alwaysRun = true)
    public void launchBrowers(ITestContext context) throws Exception {
        //TestngContext.setContext(arg0);
        TestngContext.setContext(context);
        setDriver();
        driver.navigate().to("http://book.theautomatedtester.co.uk");
    }

    @Test(priority = 10)
    public void testFindElements() {

        //driver.findElement(By.id("verifybutton"));

        // findElements example //
        /*
         * List<WebElement> elements = driver.findElements(By.id("verifybutton")); // Assert.assertEquals(1, elements.size()); /*
         * 
         */
        /*
         * // find elements by name driver.findElement(By.name("selected(1234)"));
         */

        /*
         * //find elements by name with list on chapter 1 page (http://book.theautomatedtester.co.uk/chapter1)
         * 
         * List<WebElement> elements = driver.findElements(By.name("selected(1234)")); Assert.assertEquals(1, elements.size());
         */

        /*
         * //findElements by classname
         * 
         * List<WebElement> elements = driver.findElements(By.className("storetext")); Assert.assertEquals(1, elements.size());
         */

        /*
         * //finding elements by xpath WebElement element = driver.findElement(By.xpath(".//*[@id='verifybutton']"));
         */

        /*
         * // finding multiple elements using findElements by xpath List<WebElement> elements =
         * driver.findElements(By.xpath("//input")); Assert.assertEquals(6, elements.size());
         */

        /*
         * //finding element by link text driver.findElement(By.linkText("Home Page"));
         */

        /*
         * // findElementsByLinkText List<WebElement> elements = driver.findElements(By.linkText("Home Page"));
         * Assert.assertEquals(1, elements.size());
         */

        //        Question to Herb: how to Assert an element found by css selector. why does the following fail???
        //        Web Page: http://book.theautomatedtester.co.uk/chapter1 and element i am trying to AssetEquals is 'Home Page' link.
        //        Assert.assertEquals(driver.findElement(By.cssSelector(".mainbody>p>a")), "Home Page");

        //        //Find elements by linkText
        List<WebElement> elements = driver.findElements(
            By.linkText("Chapter1"));
        Assert.assertEquals(1, elements.size());



    }

    @AfterTest(alwaysRun = true)
    public void terminateApp() {
        tearDown();
    }

}
