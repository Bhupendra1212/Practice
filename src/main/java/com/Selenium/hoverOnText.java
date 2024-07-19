package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class hoverOnText {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		 WebDriver driver=new ChromeDriver(options);
		 driver.get("https://www.browserstack.com/guide/mouse-hover-in-selenium");
		 WebElement course=driver.findElement(By.xpath("//span[@class=\"nav_item_name\"]"));
		 Actions mouse=new Actions(driver);
		 mouse.moveToElement(course).perform();
		 driver.close();
	}

}
