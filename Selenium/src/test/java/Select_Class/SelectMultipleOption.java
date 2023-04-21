package Select_Class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMultipleOption {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Lenovo/Desktop/Study/MutiselectDropdown1.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement ddvalue = driver.findElement(By.id("Menu"));
		Select sel=new Select(ddvalue);
		for (int i = 0; i < 3; i++) {
			sel.selectByIndex(i);
			Thread.sleep(1000);
		}
		driver.close();

	}

}
