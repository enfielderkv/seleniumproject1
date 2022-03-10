package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Launch {
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Kandhavel\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");		
		
		WebDriver driver = new ChromeDriver();
		 driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
	
		
		driver.navigate().to("https://www.myntra.com/");
		
		driver.navigate().to("https://www.ajio.com/");
		
		driver.navigate().to("https://www.facebook.com/myntra/");		
		 
		driver.navigate().to("https://www.facebook.com/");
		
		
		WebElement google = driver.findElement(By.id("email"));
		
		google.sendKeys("sms");
		
		WebElement googleuser = driver.findElement(By.xpath("//input[@type='password']"));
		
		googleuser.sendKeys("wrongpassword");
	
	driver.findElement(By.xpath("//button[@value='1']")).click();
	
	
	
	
	
	
	
}
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


