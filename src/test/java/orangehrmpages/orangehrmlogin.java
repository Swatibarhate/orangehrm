package orangehrmpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class orangehrmlogin {
	WebDriver driver;
	
	@FindBy(id="txtUsername")
	WebElement Username;
	
	@FindBy(id="txtPassword")
	WebElement Pwd;
	
	@FindBy(id="btnLogin")
	WebElement LoginButton;
	
	public orangehrmlogin(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void login(String username, String pwd) {
		Username.sendKeys(username);
		Pwd.sendKeys(pwd);
		LoginButton.click();
	}

	//public void username(String name) {
	//	username.sendKeys(name);
	//}
	//public void pwd(String pass) {
	//	pwd.sendKeys(pass);
	//}
	
	

}
