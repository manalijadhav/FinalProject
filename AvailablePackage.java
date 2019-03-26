package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AvailablePackage extends Factory {

	public AvailablePackage(WebDriver iDriver) {
	
		super(iDriver);
		
	}
	
	public void AvailableHoliday(String destination,String title,String Fname,String Sname,String title1,String Fname1,String Sname2,String MobileNo,String Email)throws Exception
	{
		Actions action= new Actions(driver);
		
		driver.findElement(property.getElement("E_HOLIDAYS")).click();
		boolean displayStatus1 = driver.findElement(property.getElement("E_HOLIDAYS")).isEnabled();
		System.out.println("Holidays tab isEnabled= "+displayStatus1);
		
		Thread.sleep(3000);
		
		String url2=driver.getCurrentUrl();
		System.out.println(url2);
		if (url2.contains("via.com"))
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
				
		
				driver.findElement(property.getElement("E_BOOK1")).click();
				boolean displayStatus4 = driver.findElement(property.getElement("E_BOOK1")).isEnabled();
				System.out.println("Book1 button isEnabled= "+displayStatus4);
				new WebDriverWait(driver, 20);
				
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"holidaysPriceCalendar\"]/div/div[2]/div[5]/div[4]/div/div")).click();
		
				boolean displayStatus5 = driver.findElement(property.getElement("E_ABOOK1")).isEnabled();
				System.out.println("Calender book button isEnabled= "+displayStatus5);
				new WebDriverWait(driver, 20);

				JavascriptExecutor js = (JavascriptExecutor)driver;
				new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(property.getElement("E_Title1")));
				Select select =new Select(driver.findElement(property.getElement("E_Title1")));
				new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(property.getElement("E_Title1")));
				System.out.println(title);
				if(title.contains("Mr"))
				{
				
				select.selectByValue("Mr");
				}
				else if(title.contains("Mrs"))
				{
					select.selectByValue("Mrs");
				}
			
				
	/*	driver.findElement(property.getElement("E_Title1")).click();
		driver.findElement(property.getElement("E_Title")).click();*/
	
		driver.findElement(property.getElement("E_AName1")).sendKeys(Fname);
		
		driver.findElement(property.getElement("E_AName2")).sendKeys(Sname);
		
		driver.findElement(property.getElement("E_Day1")).click();
		driver.findElement(property.getElement("E_Day")).click();
		driver.findElement(property.getElement("E_Month1")).click();
		driver.findElement(property.getElement("E_Month")).click();
		driver.findElement(property.getElement("E_Year1")).click();
		driver.findElement(property.getElement("E_Year")).click();
		
		Select select1=new Select(driver.findElement(property.getElement("E_Title2")));
		select1.selectByVisibleText(title1);
		/*driver.findElement(property.getElement("E_Title21")).click();
		driver.findElement(property.getElement("E_Title2")).click();*/
		
		driver.findElement(property.getElement("E_FirstName2")).sendKeys(Fname1);
		
		driver.findElement(property.getElement("E_SecondName2")).sendKeys(Sname2);
		
		driver.findElement(property.getElement("E_Day21")).click();
		driver.findElement(property.getElement("E_Day2")).click();
		driver.findElement(property.getElement("E_Month21")).click();
		driver.findElement(property.getElement("E_Month2")).click();
		driver.findElement(property.getElement("E_Year21")).click();
		driver.findElement(property.getElement("E_Year2")).click();
		
		
		driver.findElement(property.getElement("E_MobileNo")).sendKeys(MobileNo);
		
		try 
		{
			new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(property.getElement("E_MobileNo")));
		}
		catch(TimeoutException T)
		{
			throw new AssertionError("Invalid Mobile Number");
		}
		driver.findElement(property.getElement("E_Email")).clear();
		driver.findElement(property.getElement("E_Email")).sendKeys(Email);
		try 
		{
			new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(property.getElement("E_Email")));
		}
		catch(TimeoutException T)
		{
			throw new AssertionError("Invalid Email ID");
		}
		
		driver.findElement(property.getElement("E_Checkbox")).click();
		driver.findElement(property.getElement("E_MakePayment")).click();
		
		driver.findElement(property.getElement("E_ProceedPayment")).click();
		new WebDriverWait(driver, 60);

	}
}

