package com.logintest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



import java.util.concurrent.TimeUnit;
import io.percy.selenium.Percy;

public class LoginTest {


    @Test
    public void launchPageURL() throws InterruptedException {
        Percy percy;
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        percy = new Percy(driver);
        driver.get("https://www.adobe.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String title=driver.getTitle();
        percy.snapshot("Demo");
        Thread.sleep(3000);

                driver.quit();
    }
}
