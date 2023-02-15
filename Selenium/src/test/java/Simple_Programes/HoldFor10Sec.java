package Simple_Programes;

import org.openqa.selenium.chrome.ChromeDriver;

public class HoldFor10Sec {

	public static void main(String[] args) throws Throwable {
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(10000);
		driver.close();

	}

}
