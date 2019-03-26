package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BookHolidayFactory extends Factory {

	public BookHolidayFactory(WebDriver iDriver)
	{
		super(iDriver);
	}
	
	public void BookHoliday(String fname, String lname, String email, String mobile)throws Exception{
		
		driver.findElement(property.getElement("E_FNAME")).clear();
		driver.findElement(property.getElement("E_FNAME")).sendKeys(fname);
		
		driver.findElement(property.getElement("E_LNAME")).clear();
		driver.findElement(property.getElement("E_LNAME")).sendKeys(lname);
		
		driver.findElement(property.getElement("E_EMAIL")).clear();
		driver.findElement(property.getElement("E_EMAIL")).sendKeys(email);
		
		driver.findElement(property.getElement("E_MOBILE")).clear();
		driver.findElement(property.getElement("E_MOBILE")).sendKeys(mobile);
		
		driver.findElement(property.getElement("E_DEPARTURE_DATE")).click();
		
		driver.findElement(property.getElement("E_DDATE")).click();
		
		/*driver.findElement(property.getElement("E_PROCEED_BTN")).click();
		boolean displayStatus5 = driver.findElement(property.getElement("E_PROCEED_BTN")).isEnabled();
		System.out.println("Proceed button isEnabled= "+displayStatus5);
		
		try {
	
			new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("E_SEND")));
			
		}
		catch(TimeoutException T) {
			throw new AssertionError("Send button is not visible");
		}
		System.out.println("Entering OTP");
		
		driver.findElement(property.getElement("E_SEND")).click();
		boolean displayStatus6 = driver.findElement(property.getElement("E_SEND")).isEnabled();
		System.out.println("Proceed button isEnabled= "+displayStatus6);*/
	}
	
	
}
