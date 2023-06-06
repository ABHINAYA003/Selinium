package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day5q123 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://j2store.net/free/");
		driver.manage().window().maximize();

		String title=driver.getTitle();
		if(title.equals("Home")) {

		 System.out.println("Same");
		 }
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1050)", "");
		Thread.sleep(3000);

		// js.executeScript("window.scrollBy(0,2000)", "");
		WebElement clothing=driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/a/img"));
		clothing.click();
		String clothing_shop=driver.getTitle();
		if(clothing_shop.equals("Shop")) {
		System.out.println("Same name");
		}

		WebElement clothone=driver.findElement(By.xpath("//*[@id=\"akeeba-renderjoomla\"]/div/div/div[1]/div[1]/div[1]/div/h2/a"));
		String nameofone=clothone.getText();
		System.out.println(nameofone);
		driver.quit();
		}
}
