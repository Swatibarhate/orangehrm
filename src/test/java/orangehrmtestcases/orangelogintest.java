package orangehrmtestcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Excelutility.ReadWriteexcelfile;

import com.baseclass1.library;


import orangehrmpages.orangehrmlogin;


public class orangelogintest extends library {

	      	@BeforeMethod
			public void launchbrowser() throws IOException {
				
				launchApplication();
				
			}
			

			@Test(dataProvider="orangehrm")
			
			public void orangehrmlogintest(String username, String powd) throws IOException {
				
				orangehrmlogin lpage=new orangehrmlogin(driver);
				//ExcellUtil=new ExcellUtil();
				//lpage.username(util.excel_username(2));
				//lpage.pwd(util.excel_password(2));
				lpage.login(username, powd);
				
			}
			@DataProvider(name="orangehrm")
			  public  Object[][] passData() throws IOException{
				ReadWriteexcelfile util =  new ReadWriteexcelfile();
				
				  int rowcount = util.getRowCount("C:\\Users\\shrik\\eclipse-workspace\\orangehrm\\src\\test\\resources\\Testdata\\newlinkedin.xlsx","Sheet1");
				  int CellCnt = util.getcellCount("C:\\Users\\shrik\\eclipse-workspace\\orangehrm\\src\\test\\resources\\Testdata\\newlinkedin.xlsx","Sheet1",1);
				  System.out.println(rowcount+"  "+CellCnt);
				  Object[][] data = new Object[rowcount][CellCnt];
				  for(int i=1;i<=rowcount;i++) 
					{				  
					  for(int j=0;j<CellCnt;j++) {
						  data[i-1][j] =util.getCelldata ("C:\\Users\\shrik\\eclipse-workspace\\orangehrm\\src\\test\\resources\\Testdata\\newlinkedin.xlsx","sheet1", i, j);
								  
								  						  
					 }
					}
			 
				  return data;
				  }
			@AfterMethod
			public void close() throws IOException  {
				screenshot("src/test/resources/screenshots/orangehrm1.png");
				quit();
			
			}

}
