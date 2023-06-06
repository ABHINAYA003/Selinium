package com.selenium.day7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day7q1 {
	
	@Test
	  public void VerifyTitle() 
	  {
		  WebDriverManager.edgedriver().setup();
		  WebDriver driver=new EdgeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");
		  String actualTitle= driver.getTitle();
		  AssertJUnit.assertEquals(actualTitle, driver.getTitle());
	  }
	}
	
  