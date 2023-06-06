package com.example.testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day6q2 {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");
		driver.findElement(By.xpath("//*[@id=\"first_name\"]")).sendKeys("Prajeesh");
		driver.findElement(By.xpath("//*[@id=\"last_name\"]")).sendKeys("s");
		driver.findElement(By.xpath("//*[@id=\"user_email\"]")).sendKeys("praju@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"radio_1665627729_Male\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("praju@2004");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,3000)", "");
		driver.findElement(By.xpath("//*[@id=\"date_box_1665628538_field\"]/span/input[1]")).sendKeys("05/09/2004");
		driver.findElement(By.xpath("//*[@id=\"input_box_1665629217\"]")).sendKeys("India");
		driver.findElement(By.xpath("//*[@id=\"phone_1665627880\"]")).sendKeys("9876543210");
		driver.findElement(By.xpath("//*[@id=\"country_1665629257\"]")).sendKeys("india");
		driver.findElement(By.xpath("//*[@id=\"phone_1665627865\"]")).sendKeys("9898989765");
		driver.findElement(By.xpath("//*[@id=\"date_box_1665629845_field\"]/span/input[1]")).sendKeys("09/09/2023");
		driver.findElement(By.xpath("//*[@id=\"number_box_1665629930\"]")).sendKeys("3");
		driver.findElement(By.xpath("//*[@id=\"input_box_1665630010\"]")).sendKeys("3");
		driver.findElement(By.xpath("//*[@id=\"radio_1665627931_Yes\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"radio_1665627997_Single Room\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"radio_1665628131_None\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"privacy_policy_1665633140\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"user-registration-form-771\"]/form/div[4]/button")).click();
}
}
