package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SearchHolidayFactory extends Factory{
	
	public SearchHolidayFactory(WebDriver iDriver)
		{ 
			super(iDriver);
		}

		public void SearchHoliday(String destination)throws Exception
		{
			Actions action= new Actions(driver);
			driver.findElement(property.getElement("E_HOLIDAYS")).click();
			boolean displayStatus1 = driver.findElement(property.getElement("E_HOLIDAYS")).isEnabled();
			System.out.println("Holidays tab isEnabled= "+displayStatus1);
			
			Thread.sleep(3000);
		//	new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(property.getElement("E_DESTINATION")));
			String url1=driver.getCurrentUrl();
			System.out.println(url1);
			if (url1.contains("via.com"))
			{
				
				System.out.println("Internal link exists 1st Verification");
			}
			else
			{
				
				System.out.println("External link");
			}
			driver.findElement(property.getElement("E_DESTINATION")).clear();
			driver.findElement(property.getElement("E_DESTINATION")).sendKeys(destination);
			
			try 
			{
				new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@id='ui-id-1']/li[2]")));
			}
			catch(TimeoutException T)
			{
				throw new AssertionError("Destination ,city not found");
			}
			
			WebElement E=driver.findElement(By.xpath("//ul[@id='ui-id-1']/li//*[contains(text(),'"+destination+"')]"));  
		
			action.moveToElement(E).click(E).perform();
			
			driver.findElement(property.getElement("E_DATE_PICKER")).click();
			
			driver.findElement(property.getElement("E_DATE")).click();
			 
			driver.findElement(property.getElement("E_ROOMS")).click();
	
			driver.findElement(property.getElement("E_DONE")).click();
			boolean displayStatus2 = driver.findElement(property.getElement("E_DONE")).isEnabled();
			System.out.println("Done button isEnabled= "+displayStatus2);
			
			driver.findElement(property.getElement("E_SEARCH")).click();
			boolean displayStatus3 = driver.findElement(property.getElement("E_SEARCH")).isEnabled();
			System.out.println("Search button isEnabled= "+displayStatus3);
			
			new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(property.getElement("E_BOOK1")));
			driver.findElement(property.getElement("E_BOOK1")).click();
			boolean displayStatus4 = driver.findElement(property.getElement("E_BOOK1")).isEnabled();
			System.out.println("Book1 button isEnabled= "+displayStatus4);
	
			new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(property.getElement("E_BOOK2")));

			driver.findElement(property.getElement("E_BOOK2")).click();
			
			try 
			{
			new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(property.getElement("E_FNAME")));
			}
			catch(TimeoutException T)
			{
				throw new AssertionError("FirstName Element not found");
			}
		}
	}


