package testExecution;

import util.Base;
import org.testng.annotations.Test;
import POM.AvailablePackage;
import POM.LoginFactory;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;

public class NewTestAvailablePackage extends Base{
	//public LoginFactory login;
	public AvailablePackage available;
	
  @Test(dataProvider = "dp")
  public void f(
			String destination, 
			String title,
			String fname,
			String lname,
			String title1,
			String fname1,
			String lname1,
			String email, 
			String mobile) throws Exception {
	  
	 // login = new  LoginFactory(driver);
	  available=new AvailablePackage(driver);
	  
	//  login.Login(username, Password);
	  available.AvailableHoliday(destination,title,fname,lname,title1,fname1,lname1,email,mobile);
	  
	 driver.get("https://in.via.com/");
	/* driver.findElement(By.xpath("//div[@class='elementPad menuLabel secNavIcon']")).click();
	 driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
	 driver.get("https://in.via.com/");*/
  }
  @DataProvider
  public Object[][] dp() throws Exception {
	  Object data[][]=excel.MyDataProvider("Sheet6",9);
    return data;
  }
}