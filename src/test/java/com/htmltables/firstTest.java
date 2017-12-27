package com.htmltables;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pages.tables.TablePages;
import com.utils.BaseUtils;
import com.utils.ExcelUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstTest extends BaseUtils {

    @BeforeClass(alwaysRun = true)
    public void launchBrowsers(ITestContext context) throws Exception {

        setDriver();
        NavigatToUrl();

    }

    //        WebDriver driver = new ChromeDriver();
    // String baseUrl = "http://demo.guru99.com/selenium/newtours/";
    String expectedTitle = "Welcome: Mercury Tours";
    String actualTitle = "";


    //driver.get(baseUrl);

    // get the actual value of the title
    actualTitle=driver.getTitle();

    /*
     * compare the actual title of the page with the expected one and print the result as "Passed" or "Failed"
     */
    if(actualTitle.contentEquals(expectedTitle))
    {
        System.out.println("Test Passed!");
    }else
    {
        System.out.println("Test Failed");
    }

    @AfterClass(alwaysRun = true)
        public void terminateApp() {
            tearDown();
        }

}}
