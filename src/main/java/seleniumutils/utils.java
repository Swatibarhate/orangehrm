package seleniumutils;


	import java.io.File;
	import java.io.IOException;

	import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.By;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.Assert;

import com.baseclass1.library;

	

	public class utils extends library {
		
		WebDriver driver;
		
		//constructor
		public utils(WebDriver driver) {
			this.driver=driver;
			
		}
		//to take screenshot
		public void screenshot(String path)  {
			TakesScreenshot ts=(TakesScreenshot)driver;
			File source=ts.getScreenshotAs(OutputType.FILE);
			try {
			FileUtils.copyFile(source, new File(path));
			
		} catch (IOException e) {
			e.printStackTrace();
			
		}
		
		}
		public void getTitle() {
			//String title=driver.getTitle();
			System.out.println(driver.getTitle());
			//Assert.assertEquals(title, "Expected");
		}
		//explicit wait
		public void Expicitlywait(String Locator) {
			WebDriverWait wait=new WebDriverWait(driver,20);
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(Locator))));
		}
		
	}



