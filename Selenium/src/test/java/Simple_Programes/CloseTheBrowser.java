package Simple_Programes;

import org.openqa.selenium.chrome.ChromeDriver;

public class CloseTheBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		new ChromeDriver().close();

	}

}
