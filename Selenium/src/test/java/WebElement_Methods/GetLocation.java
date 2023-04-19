package WebElement_Methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		Point loc = driver.findElement(By.xpath("//img[@class='lnXdpd']")).getLocation();
		int x = loc.getX();
		int y = loc.getY();
		System.out.println("x===="+x);
		System.out.println("y===="+y);
		driver.close();
	}

}
