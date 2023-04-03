package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_using_AxesAndIndex {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.findElement(By.xpath("//div[@class='selenium-button-container'][1]/descendant::a[@class='selenium-button selenium-webdriver text-uppercase font-weight-bold']")).click();
		driver.close();
	}

}
