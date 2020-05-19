package Linkedinpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class linkedinloginpage {
        
	WebDriver driver;
	
	//@FindBy(className="nav__button-secondary")
	//WebElement Signin;
	
	
	@FindBy(id="username")
	WebElement username;
	
	@FindBy(id="password")
	WebElement pwd;
	
	//@FindBy(className="btn__primary--large from__button--floating")
	//WebElement Signin;
	
	
	public linkedinloginpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void loginmethod(String name, String pass) {
		
		username.sendKeys("name");
		pwd.sendKeys("pass");
		//Signin.click();
	}

	
	//public void username(String name ) {
	//	username.sendKeys(name);
	//}
	//  public void pwd(String pass) {
	//	pwd.sendKeys(pass);
	//}

}



   //public void classname() {
	   
   //}
