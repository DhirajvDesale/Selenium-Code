package Robot_Class;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_Using_Robot_Class {

	public static void main(String[] args) throws AWTException, Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Robot robo=new Robot();
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_P);
		robo.keyRelease(KeyEvent.VK_P);
		robo.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		driver.close();

	}

}
