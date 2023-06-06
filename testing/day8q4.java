package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day8q4 {
	public static void main(String [] args)
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.abhibus.com/bus-ticket-booking");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"source\"]")).sendKeys("Coimbatore");
		driver.findElement(By.xpath("//*[@id=\"destination\"]")).sendKeys("SriKrishnaCollege");
		WebElement date=driver.findElement(By.xpath("//*[@id=\"datepicker1\"]"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','05/06/2023')", date);
}
}
