package com.testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hina\\Desktop\\Agama_Selenium_Jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.facebook.com/");
		//get the title of the page
		System.out.println("The title of the page is" + driver.getTitle());
		//close the page
		driver.close();
		
	
	
	}

}
