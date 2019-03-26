package testExecution;

import util.Base;
import org.testng.annotations.Test;
import POM.BookHolidayFactory;
import POM.LoginFactory;
import POM.SearchHolidayFactory;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;


public class NewTest extends Base{
	//public LoginFactory login;
	public SearchHolidayFactory search;
	public BookHolidayFactory book;
	
	@Test(dataProvider = "dp")
	  public void f(
				String destination, 
				String fname,
				String lname,
				String email, 
				String mobile) throws Exception {
		  
		//  login = new  LoginFactory(driver);
		  search=new SearchHolidayFactory(driver);
		  book = new BookHolidayFactory(driver);
		  
		//  login.Login(username, Password);
		  search.SearchHoliday(destination);
		  book.BookHoliday(fname, lname, email, mobile);
		  
		 driver.get("https://in.via.com/");
		 /*driver.findElement(By.xpath("//div[@class='elementPad menuLabel secNavIcon']")).click();
		 driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();*/
	  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  driver.get("https://in.via.com/");
  }


  @DataProvider
  public Object[][] dp() throws Exception {
	  Object data[][]=excel.MyDataProvider("Sheet5",5);
    return data;
      
  
  }
  }

