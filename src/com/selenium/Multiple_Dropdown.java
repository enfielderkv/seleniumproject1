package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Multiple_Dropdown {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Kandhavel\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
		driver.manage().window().maximize();
		WebElement checking = driver.findElement(By.id("multi-select"));// here we will use "select" method for multiple dropdown	
		Select check =new Select(checking);//we have to give reference name for this 
		boolean bb = check.isMultiple();//here we are checking the selected dropdown box is multiple or not .so for that we are using boolean method. hence "'isMultiple" method is used here to check
		System.out.println("multiple dropdown is"+bb);// just normal printout statement 
		
		List<WebElement> example = check.getOptions();// 
		for (WebElement colour : example) {// after that we are using for each method 
			System.out.println(colour.getText());//
			
		}
		int in = example.size();
		System.out.println(in);
	}

}
