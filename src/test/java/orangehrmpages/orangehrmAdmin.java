package orangehrmpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class orangehrmAdmin {
	
WebDriver driver;
	
	@FindBy(id="menu_admin_viewAdminModule")
	WebElement Admin;
	
	@FindBy(id="searchSystemUser_userName")
	WebElement Username ;
	
	@FindBy(id="searchSystemUser_userType")
	WebElement UserRoll ;
	@FindBy(id="searchSystemUser_employeeName_empName")
	WebElement Employeename;
	@FindBy(id="searchSystemUser_status")
	WebElement Status;
	@FindBy(id="searchBtn")
	WebElement Search;
	
	
	
	public orangehrmAdmin(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickadmin() {
		WebDriverWait wait= new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(Admin));
		Admin.click();
	}
	public void username(String name) {
		Username.sendKeys(name);
	}
    public void userroll(String text) {
    	Select sel=new Select(UserRoll);
    	sel.selectByVisibleText(text);
    }
    public void employeename(String name) {
    	Employeename.sendKeys(name);
    }
    public void status(String text) {
    	Select sel=new Select(Status);
    	sel.selectByVisibleText(text);
    }
	public void clicksearch() {
		Search.click();
	}

}
