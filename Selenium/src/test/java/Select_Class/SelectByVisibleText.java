package Select_Class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByVisibleText {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("C:/Users/Lenovo/Desktop/Study/Single%20Select%20DropDown.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement ddvalue = driver.findElement(By.id("Menu"));
		Select sel=new Select(ddvalue);
		sel.selectByVisibleText("Pizza");
		Thread.sleep(1000);
		driver.close();

	}

}
