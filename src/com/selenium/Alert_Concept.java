package com.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;

public class Alert_Concept {
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kandhavel\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		
		WebDriver alert = new ChromeDriver();
		alert.get("http://demo.automationtesting.in/Alerts.html");
		
		alert.manage().window().maximize();
		
		//simple alert:
		
		alert.findElement(By.xpath("//button[@class='btn btn-danger']")).click();//we can directly use click here or else the below method also can be done
		alert.switchTo().alert().accept();
		
		//confirm alert:
		
		alert.findElement(By.linkText("Alert with OK & Cancel")).click();		
		WebElement cantakereturntype = alert.findElement(By.xpath("//button[@class='btn btn-primary']"));//we can also take return type r else just assing with driver.findelements
		cantakereturntype.click();
 		alert.switchTo().alert().accept();	//first it will select ok	
		WebElement cantakereturntype1 = alert.findElement(By.xpath("//button[@class='btn btn-primary']"));//return type name must be different
		
		cantakereturntype1.click();	
		alert.switchTo().alert().dismiss();//now it will select cancel
				
		//prompt alert:
		
		alert.findElement(By.linkText("Alert with Textbox")).click();   
		Thread.sleep(3000);
		WebElement usethisforsendkeys = alert.findElement(By.xpath("//button[@class='btn btn-info']"));
		usethisforsendkeys.click();		
		Thread.sleep(2000);
		Alert takereturntypemethod = alert.switchTo().alert();//must use returntype why we are going for return here becoz we have to give a name in send keys .
		takereturntypemethod.accept();
		takereturntypemethod.sendKeys("legion");
	
				
				
				
				
		
	}

	

}
