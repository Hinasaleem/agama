package com.testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload {

	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Hina\\Desktop\\Agama_Selenium_Jar\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
    //driver.get("https://filebin.net/");
    
    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    
    //to maximize the windows
    driver.manage().window().maximize();
    
    driver.get("https://filebin.net/");
    //C:\\Users\\Hina\\Desktop\\selenium_demo_fileload\\Fileupload.text
Thread.sleep(1000);
    driver.findElement(By.xpath("//*[@id=\'fileField\']")).sendKeys("C:\\Users\\Hina\\Desktop\\selenium_demo_fileload\\Fileupload.text");

	}

}
