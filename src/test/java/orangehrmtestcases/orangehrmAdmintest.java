package orangehrmtestcases;

import java.io.IOException;

import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.baseclass1.library;

import orangehrmpages.orangehrmAdmin;
import orangehrmpages.orangehrmlogin;

public class orangehrmAdmintest extends library{
	
	@BeforeMethod
	public void launchbrowser() throws IOException {
		
		launchApplication();
		orangehrmlogin lpage=new orangehrmlogin(driver);
		//lpage.username("Admin");
		//lpage.pwd("admin123");
		lpage.login("Admin", "admin123");
	}
	   @Test(priority=1)
	   public void Adminpage() {
		  orangehrmAdmin  hrm=new orangehrmAdmin(driver);
		  hrm.clickadmin();
		  hrm.username("shiva");
		  hrm.userroll("Admin");
		  hrm.employeename("Sawminathan");
		  hrm.status("Enabled");
		  hrm.clicksearch();
	 }
	   
	   
	   @AfterMethod
	   public void close() throws IOException {
		   screenshot("src/test/resources/Screenshots/orangehrmAdmin.png");
		   quit();
		   
	}
}
