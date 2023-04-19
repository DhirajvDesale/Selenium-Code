package WebElement_Methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		boolean googleSearch = driver.findElement(By.xpath("(//input[@name='btnK'])[2]")).isEnabled();
		System.out.println(googleSearch);
		driver.close();

	}

}
