package com.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locationstest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hina\\Desktop\\Agama_Selenium_Jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	driver.get("https://www.facebook.com/");
	
	driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
	
	//driver.findElement(By.id("dir")).sendKeys("aaa");
	driver.findElement(By.id("pass")).sendKeys("a123");
	
	driver.findElement(By.xpath("//*[@id=\'u_0_b\']")).click();
	
	driver.findElement(By.linkText("u_0_f")).click();
	
	driver.findElement(By.partialLinkText("u_0_e")).click();
	
	driver.findElement(By.partialLinkText("/html/body/div[1]")).click();
	
	driver.findElement(By.xpath("//*[@id=\"u_0_w\"]")).sendKeys("1234");
	
	driver.findElement(By.xpath("abc@gmail.com")).sendKeys("1234");
	//Link text
	driver.findElement(By.linkText("Forgot account?")).click();
	//partial link text
	driver.findElement(By.partialLinkText("Forgot")).click();
	
	// to close
	driver.close();
	
	


	}

}
