package Bhupendra;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class codeTest {
	public static void main(String[] args) throws Exception {
     	WebDriverManager.chromedriver().setup();
     	ChromeDriver driver = new ChromeDriver();
     	driver.get("https://forzafootball.com/");
     	driver.manage().window().maximize();
     	driver.findElement(By.cssSelector(".Header-menu")).click();
     	Thread.sleep(3000);
     	driver.findElement(By.xpath("(//a[@class='ListItem '])[6]")).click();
     	WebElement list = driver.findElement(By.tagName("ul"));
     	List<WebElement> listedItems = list.findElements(By.tagName("li")); 
     	// Print out the text content of each listed item
     	for (WebElement listedItem : listedItems) {
        System.out.println(listedItem.getText());}
     	Thread.sleep(3000);
     	Set<String> window=driver.getWindowHandles();
     	for(String x:window) {
     		if(!window.equals(x)) {
     			driver.switchTo().window(x);
     			
     		}
     	}
     	
     	driver.findElement(By.xpath("/html/body/div/div[1]/div/div/div/a[8]/span")).click();
     	driver.findElement(By.xpath("//input[@class='TextInput-input']")).sendKeys("Indian Super League");
     	Thread.sleep(2000);
     	driver.findElement(By.xpath("(//a[@class='ListItem '])[1]")).click();
  
    	Thread.sleep(2000);
     	driver.findElement(By.xpath("(//span[@class='TabBar-item-text'])[2]"));
     	
     	driver.findElement(By.xpath("(//span[@class='TabBar-item-text'])[2]")).click();
     	WebElement fixturesElement = driver.findElement(By.xpath("(//div[@class='swiper-container swiper-container-initialized swiper-container-horizontal swiper-container-autoheight'])"));
     	List<WebElement> fixturesList = fixturesElement.findElements(By.tagName("h3")); // Print out the text content of each listed item
     	for (WebElement fixtures : fixturesList) {
            	System.out.println(fixtures.getText());}
     	
     	driver.findElement(By.xpath("(//span[@class='TabBar-item-text'])[3]")).click();

     	WebElement fixturesElement1 = driver.findElement(By.xpath("(//div[@class='swiper-container swiper-container-initialized swiper-container-horizontal swiper-container-autoheight'])"));
     	List<WebElement> fixturesList1 = fixturesElement1.findElements(By.tagName("h3")); // Print out the text content of each listed item
     	for (WebElement fixtures : fixturesList1) {
            	System.out.println(fixtures.getText());}
     	driver.quit();
		}

}