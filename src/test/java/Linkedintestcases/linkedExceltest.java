package Linkedintestcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Excelutility.ReadWriteexcelfile;
import com.baseclass1.library;


import Linkedinpages.linkedinloginpage;


public class linkedExceltest extends library {
	
	@BeforeMethod
        
	     public void launchbrowser () throws IOException {
		   launchApplication ();
		   
	}
	
	
	@Test
	
	public void logintest() throws IOException {
		
		linkedinloginpage ln=new linkedinloginpage(driver);
		ReadWriteexcelfile util=new ReadWriteexcelfile();
		ln.loginmethod(util.excel_username(3),util.excel_password(3));
		
	}
	
	@AfterMethod
	public void close() throws IOException  {
		screenshot("src/test/resources/screenshots/Linkedinlogin.png");
		quit();
	
	}

	
}
