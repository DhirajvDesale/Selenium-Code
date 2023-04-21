package Select_Class;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getSelectedOption {

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
		List<WebElement> AllOption = sel.getAllSelectedOptions();
		for(WebElement we:AllOption) {
			String AllOpation1 = we.getText();
			System.out.println(AllOpation1);
		}
		driver.close();

	}

}
