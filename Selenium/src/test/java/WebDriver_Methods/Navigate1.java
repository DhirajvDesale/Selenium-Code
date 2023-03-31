package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate1 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		Navigation nav = driver.navigate();
		nav.back();
		Thread.sleep(1000);
		nav.forward();
		Thread.sleep(1000);
		nav.refresh();
		driver.close();

	}

}
