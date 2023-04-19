package WebElement_Methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("C:/Users/Lenovo/Desktop/Study/CheckBox.html");
		WebElement w1 = driver.findElement(By.xpath("//input[@id='ch1']"));
		w1.click();
		boolean result = w1.isSelected();
		System.out.println(result);
		driver.close();

	}

}
