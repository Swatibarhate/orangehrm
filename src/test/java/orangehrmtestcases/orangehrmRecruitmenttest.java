package orangehrmtestcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.baseclass1.library;

import orangehrmpages.orangehrmRecruitment;
import orangehrmpages.orangehrmlogin;

public class orangehrmRecruitmenttest extends library {

  	@BeforeMethod
	public void launchbrowser() throws IOException {
		
		launchApplication();
		orangehrmlogin lpage=new orangehrmlogin(driver);
		//lpage.username("Admin");
		//lpage.pwd("admin123");
		lpage.login("Admin", "admin123");
	}
	

	//@Test(priority=1)
	
	public void recruitmentpage() {
		orangehrmRecruitment hrm=new orangehrmRecruitment(driver);
		hrm.clickrectrutment();
		hrm.selectjobtitle("CEO");
		hrm.status("Hired");
		hrm.Candidate("Swati");
		hrm.keywords("testing");
		hrm.methodofapplication("Manual");
		hrm.clicksearch();
		
		
		
	}
	
	@Test(priority=2)
	
	public void addbutton() {
		orangehrmRecruitment hrm=new orangehrmRecruitment(driver);
		hrm.clickrectrutment();
		hrm.clickadd();
		
		hrm.Fullname("Swati", "Barhate");
		hrm.contactinfo("swati@gmail.com", "1234567");
		hrm.resume("C:\\Swati\\Excel\\Dumyresume.xlsx");
	}
	@AfterMethod
	public void close() throws IOException  {
		screenshot("src/test/resources/screenshots/orangehrm1.png");
		quit();
	
	}
}
