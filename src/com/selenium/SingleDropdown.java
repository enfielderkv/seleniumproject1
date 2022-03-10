package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kandhavel\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(3000);
		//daydropdownbox

		WebElement date = driver.findElement(By.id("day"));//1.)in dropdown concept we have to use "select" 
		Select dateno = new Select(date);         //2.)remember that we have to take return type for this driver.findelement and give a reference name
		dateno.selectByIndex(13);           //3.)after that add new reference name in the select fuction and directly call the find element ref name
		Thread.sleep(3000); //now u can type the ref name which is given in the select row now we can use the select by value,selectbyindex,selectbyvisibletext any of the method

		//monthlistdropdownbox

		WebElement monthlist = driver.findElement(By.id("month"));
		Select fbmonthlist = new Select(monthlist);
		fbmonthlist.selectByValue("11");
		Thread.sleep(3000);
		//yearlistdropdownbox

		WebElement yearlist = driver.findElement(By.xpath("//select[@title='Year']"));
		Select fbyearlist = new Select(yearlist);
		fbyearlist.selectByVisibleText("1996");
		Thread.sleep(2000);

		//genderclick
		
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		Thread.sleep(2000);
		//singupbutton

		WebElement signup = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		signup.click();		






	}

}
