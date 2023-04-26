package Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:/Users/Lenovo/Desktop/Study/Button.html");
		WebElement target = driver.findElement(By.id("button"));
		Actions act=new Actions(driver);
		act.doubleClick(target).perform();
		driver.close();
	}

}
