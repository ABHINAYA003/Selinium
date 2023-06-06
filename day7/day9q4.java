package com.selenium.day7;

import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Test

public class day9q4 {
 WebDriver driver;
 
 @Parameters
 @BeforeTest
 public void TC_004(String browsers) {
	 if(browsers.equalsIgnoreCase("test")) {
		 WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 System.out.println("Chrome initiated");
		 
	 }
	 else if(browsers.equalsIgnoreCase("Edge")) {
		 WebDriverManager.edgedriver().setup();
		 driver=new EdgeDriver();
		 System.out.println("Chrome initiated");
		 
	 }
 }
}