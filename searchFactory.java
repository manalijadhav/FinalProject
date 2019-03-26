package POM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchFactory extends Factory{
	
	public searchFactory(WebDriver iDriver) {
		super(iDriver);
	}
	public void search(String data)
	{
		try {
			Thread.sleep(3000);
			driver.findElements(property.getElement("E_FROM")).get(1).click();

			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		
		
	}
}
