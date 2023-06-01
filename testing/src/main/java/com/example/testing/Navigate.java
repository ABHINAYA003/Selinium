package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigate {

public static void main(String[] args) {
WebDriverManager.edgedriver().setup();
WebDriver driver = new EdgeDriver();

driver.navigate().to("https://j2store.net/free/");
driver.findElement(By.xpath("//*[@id=\"t3-header\"]/div/div/div[2]/div[2]/ul/li[1]/a")).click();
driver.navigate().back();
driver.navigate().forward();
driver.navigate().refresh();

}
}
