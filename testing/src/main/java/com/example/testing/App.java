package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
       // System.out.println( "Hello World!" );
    	WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("Sample");
        driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("Testing");
        driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("abhi@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("Abhi@2004");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2000)","");
        driver.findElement(By.xpath("//*[@id=\"input-newsletter-yes\"]")).click();
        Thread.sleep(1000);
        
    }
}
