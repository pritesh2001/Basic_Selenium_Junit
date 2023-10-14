package org.example.firstSeleniumClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenHomeWork {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        //  ChromeDriver chromeDriver = new ChromeDriver();
         WebDriver driver = new ChromeDriver();
        // WebDriver driver1 = new MicrosoftEdge();
        driver1.manage().window().maximize();
        driver1.get("https://demo.nopcommerce.com/");
    }
    }
