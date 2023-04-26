package Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehover {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[@id='denyBtn' and .='Not now']")).click();
		Thread.sleep(1000);
		WebElement ringsTarget = driver.findElement(By.xpath("//a[@title='Rings' and .='Rings ']"));
		Actions act=new Actions(driver);
		act.moveToElement(ringsTarget).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@title='Engagement Rings' and .='Engagement']")).click();
		Thread.sleep(2000);
		driver.close();

	}

}
