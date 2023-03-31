package Simple_Programes;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manage_window_size {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		Thread.sleep(1000);
		Dimension dim = new Dimension(300,900);
		driver.manage().window().setSize(dim);

	}

}
