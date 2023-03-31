package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("C:/Users/Lenovo/Desktop/Study/Link%20anchor%20tag.html");
		driver.findElement(By.linkText("google")).click();
		Thread.sleep(1000);
		driver.close();

	}

}
