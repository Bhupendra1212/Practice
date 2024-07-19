package Bhupendra;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassA {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.etsy.com/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		// click on search field
		driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys("handmade earrings");
		Thread.sleep(5000);
		// click on search icon
		driver.findElement(By.xpath("//span[@class='wt-icon wt-nudge-b-2 wt-nudge-r-1']")).click();
		Thread.sleep(5000);
		// click on product
		driver.findElement(By.xpath(
				"//h3[contains(text(),'Abstract Forget-me-nots Face Gold plated Earrings handmade with pressed flowers')]"))
				.click();
		Thread.sleep(5000);
		Set<String> window = driver.getWindowHandles();
		for (String x : window) {
			if (!window.equals(x)) {
				driver.switchTo().window(x);
			}

		}
		WebElement list=driver.findElement(By.cssSelector("#variation-selector-0"));
		Select se=new Select(list);
		se.selectByVisibleText("Gold");

		// Select se = new Select(driver.findElement(By.xpath("//div[@class='wt-select']//*[@id='variation-selector-0']")));

	}
}