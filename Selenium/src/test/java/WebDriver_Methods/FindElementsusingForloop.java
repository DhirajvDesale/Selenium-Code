package WebDriver_Methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsusingForloop {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("ABC");
		Thread.sleep(10000);
		List<WebElement> suggestions = driver.findElements(By.xpath("//div[@class='wM6W7d']/span"));
		for (int i = 0; i < suggestions.size(); i++) {
			WebElement suggestion = suggestions.get(i);
			String TxtOfSuggestion = suggestion.getText();
			System.out.println(TxtOfSuggestion);
		}
		driver.close();
	}

}
