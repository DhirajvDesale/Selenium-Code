package Select_Class;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RemoveDuplicateUsingHashset {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("C:/Users/Lenovo/Desktop/Study/MutiselectDropdown1.html");
		WebElement element = driver.findElement(By.id("Menu"));
		Select s=new Select(element);
		List<WebElement> optionOfDropdown = s.getOptions();
		//avoid dublicate using hashSet the order or insertion will not maintain
		HashSet<String> s1=new HashSet<String>();
		//we are getting text of webelement from list and adding them in Hashset 
		for (int i = 0; i < optionOfDropdown.size(); i++) {
			String textofOption = optionOfDropdown.get(i).getText();
			s1.add(textofOption);
		}
		//reading the set
		for(String Option:s1) {
			System.err.println(Option);
		}
		driver.close();


	}

}
