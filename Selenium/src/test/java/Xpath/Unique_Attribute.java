package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Unique_Attribute {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Abc");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("DEF");
		Thread.sleep(1000);
		driver.close();

	}

}
