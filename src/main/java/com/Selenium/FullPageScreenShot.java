package com.Selenium;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import ru.yandex.qatools.ashot.shooting.ShootingStrategy;

public class FullPageScreenShot {
	public static void main(String[] args) throws IOException {
		WebDriverManager.firefoxdriver().setup();
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://testingshastra.com/");
		driver.manage().window().maximize();
		AShot ashot=new AShot();
		ShootingStrategy Strategy=ShootingStrategies.viewportPasting(10000);
		Screenshot screenshot=ashot.takeScreenshot(driver);
		BufferedImage image=screenshot.getImage();
		ImageIO.write(image,"PNG", new File("usingAshot"));
		
		
		
	}

}
