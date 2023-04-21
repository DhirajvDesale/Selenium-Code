package Select_Class;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RemoveDublicateUsingLinkedHashset {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("C:/Users/Lenovo/Desktop/Study/MutiselectDropdown1.html");
		WebElement element = driver.findElement(By.id("Menu"));
		Select s=new Select(element);
		List<WebElement> optionOfDropdown = s.getOptions();
		//avoid dublicate using linkedhashSet the order or insertion will be maintain
		LinkedHashSet<String> s1=new LinkedHashSet<String>();
		//we are getting text of webelement from list and adding them in linkedHashset 
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
