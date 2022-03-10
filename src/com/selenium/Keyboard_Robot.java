package com.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_Robot {
	
	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kandhavel\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//mouse actions:
		WebElement rightclick = driver.findElement(By.linkText("Best Sellers"));
		Actions ac = new Actions(driver);
		ac.contextClick(rightclick).perform();
		
		//keyboard actions(robot):
		
		Robot bumblebee = new Robot();
		bumblebee.keyPress(KeyEvent.VK_DOWN);
		bumblebee.keyRelease(KeyEvent.VK_DOWN);
		
		bumblebee.keyPress(KeyEvent.VK_DOWN);
		bumblebee.keyRelease(KeyEvent.VK_DOWN);

		bumblebee.keyPress(KeyEvent.VK_DOWN);
		bumblebee.keyPress(KeyEvent.VK_ENTER); 
		
	
		
	}

}
 