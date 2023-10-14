package org.example.firstSeleniumClass;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenUrlWithMainMethod {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
      //  ChromeDriver chromeDriver = new ChromeDriver();
        WebDriver driver = new ChromeDriver();
       //  WebDriver driver1 = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
    }
}
