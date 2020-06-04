package mavenchrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class chromelogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver Driver=new ChromeDriver();
		Driver.get("https://www.google.com/");
		System.out.println(Driver.getTitle());
		Driver.get("https://opensource-demo.orangehrmlive.com/");
		Driver.findElement(By.xpath("//*[@id=\"divUsername\"]")).sendKeys("learn automatiom");
		

	}

}
