package com.ravens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.Wait;

import java.util.concurrent.TimeUnit;

public class App
{



    public static void main( String[] args ) {

        System.setProperty("webdriver.gecko.driver", "/Users/bwhorley/IdeaProjects/selenium/geckodriver");
        FirefoxOptions options = new FirefoxOptions();
        options.setHeadless(false);
        WebDriver driver = new FirefoxDriver(options);

        driver.get("http://www.espn.com/");
        String title = driver.getTitle();
        String expected = "Nope: The Worldwide Leader in Sports";

        System.out.println(title);

        String pagename = "ESPN";

        boolean status = title.equalsIgnoreCase(expected);
        System.out.println(status);
        //boolean titlename =

        if (status == true)

            System.out.println("Yes, it's on Espn ");
        System.out.println("And I'm done with this test");


        driver.get("https://www.nfl.com/");
        driver.quit();
    }








    }

