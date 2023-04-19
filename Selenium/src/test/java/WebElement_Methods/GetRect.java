package WebElement_Methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRect {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		Rectangle rect = driver.findElement(By.xpath("//img[@class='lnXdpd']")).getRect();
		int width = rect.getWidth();
		int height = rect.getHeight();
		int x = rect.getX();
		int y = rect.getY();
		
		System.out.println("width==="+width);
		System.out.println("height==="+height);
		System.out.println("x=="+x);
		System.out.println("y==="+y);
		
		driver.close();

	}

}
