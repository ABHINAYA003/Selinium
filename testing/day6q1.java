package com.example.testing;

//import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day6q1 {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.navigate().to("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		WebElement firstname=driver.findElement(By.xpath("//*[@id=\"input-firstname\"]"));
		firstname.sendKeys("abhinaya");
		WebElement lastname=driver.findElement(By.xpath("//*[@id=\"input-lastname\"]"));
		lastname.sendKeys("m");
		WebElement email=driver.findElement(By.xpath("//*[@id=\"input-email\"]"));
		email.sendKeys("abhi@gmail.com");
		WebElement password=driver.findElement(By.xpath("//*[@id=\"input-password\"]"));
		password.sendKeys("abhi@2004");
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,2000)","");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"input-newsletter-yes\"]")).click();
	    WebElement checkbox=driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/div/input"));   
	    checkbox.click();
	    WebElement submit=driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/button"));   
	    submit.click(); 
	      }
}
