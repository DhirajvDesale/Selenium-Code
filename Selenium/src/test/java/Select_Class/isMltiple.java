package Select_Class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class isMltiple {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("C:/Users/Lenovo/Desktop/Study/MutiselectDropdown1.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement element = driver.findElement(By.id("Menu"));
		Select s=new Select(element);
		boolean result = s.isMultiple();
		System.out.println(result);
		driver.close();

	}

}
