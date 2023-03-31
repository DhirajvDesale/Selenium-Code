package Simple_Programes;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manage_Window_Position {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		Point position=new Point(90, 300);
		driver.manage().window().setPosition(position);

	}

}
