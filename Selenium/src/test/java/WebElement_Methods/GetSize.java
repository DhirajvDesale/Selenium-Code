package WebElement_Methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		Dimension size = driver.findElement(By.xpath("//img[@class='lnXdpd']")).getSize();
		int height = size.getHeight();
		int width = size.getWidth();
		
		System.out.println("heigth=="+height);
		System.out.println("width=="+width);
		
		driver.close();

	}

}
