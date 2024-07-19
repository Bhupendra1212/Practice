package Bhupendra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class doubleTabOpen {
	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver","C:/Users/Infiwave/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
	WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		//New tab open with below command
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.youtube.com/");
	}

}

