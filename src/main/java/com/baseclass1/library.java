package com.baseclass1;


	
	import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

	import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.By;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebDriverException;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.support.ui.Select;

	public class library {
		 protected WebDriver driver;
		 public static Properties prop;
		public void launchApplication() throws IOException {
			FileInputStream fileIS = new FileInputStream("C:\\Users\\shrik\\eclipse-workspace\\orangehrm\\src\\test\\resources\\configurationproperty\\config.property");
			prop = new Properties();
			prop.load(fileIS);//Loads the config file
			String browser=prop.getProperty("browser");
			
		try {
				if(browser.equalsIgnoreCase("Firefox")) {
					System.setProperty("webdriver.firefox.driver","C:\\Swati\\Selenium\\geckodriver-v0.26.0-win64\\geckodriver.exe");
					driver = new FirefoxDriver();
					
			} else if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver","C:\\Swati\\Selenium\\chromedriver_win32\\chromedriver.exe");
				
					 driver=new ChromeDriver();
			}
				
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				driver.get(prop.getProperty("url"));
				
			} catch (WebDriverException e) {
				System.out.println("browser could not be launched");
			}
			
		}
		public void quit() {
			driver.close();
		}
		
		public void screenshot(String path) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File(path));
		
		}	
		public void dropdown(String locator1) {
			Select dropdown= new Select(driver.findElement(By.xpath(locator1)));
			
		}
		

	}



