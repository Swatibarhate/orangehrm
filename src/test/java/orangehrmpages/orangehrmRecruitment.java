package orangehrmpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class orangehrmRecruitment {
WebDriver driver;
	
	@FindBy(id="menu_recruitment_viewRecruitmentModule")
	WebElement recruitment;
	
	@FindBy(id="candidateSearch_jobTitle")
	WebElement jobtitle;
	
	@FindBy(id="candidateSearch_status")
	WebElement Status;
	
	@FindBy(id="candidateSearch_candidateName")
	WebElement CandidateName;
	
	@FindBy(id="candidateSearch_keywords")
	WebElement Keywords;
	@FindBy(id="candidateSearch_modeOfApplication")
	WebElement MethodofApplication;
	@FindBy(id="btnSrch")
	WebElement Search;
	@FindBy(id="btnAdd")
	WebElement Add;
	@FindBy(id="addCandidate_firstName")
	WebElement FirstName;
	@FindBy(id="addCandidate_lastName")
	WebElement LastName;
	@FindBy(id="addCandidate_email")
	WebElement Email;
	@FindBy(id="addCandidate_contactNo")
	WebElement ContactNo;
	@FindBy(id="addCandidate_resume")
	WebElement Resume;
	
	
	public orangehrmRecruitment (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void clickrectrutment() {
		WebDriverWait wait= new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(recruitment));
		recruitment.click();
	}
	public void selectjobtitle(String text) {
		Select sel=new Select(jobtitle);
		sel.selectByVisibleText(text);
	}
	public void status(String text) {
		Status.sendKeys(text);
	}
	public void Candidate(String text) {
		CandidateName.sendKeys(text);
	}
	public void keywords(String text) {
		Keywords.sendKeys(text);
	}
	public void methodofapplication(String text) {
		Select sel=new Select(MethodofApplication);
		sel.selectByVisibleText(text);
	}
	public void clicksearch() {
		Search.click();
	}
	public void clickadd() {
		Add.click();
	}
	public void Fullname(String fname,String lname) {
		FirstName.sendKeys(fname);
		LastName.sendKeys(lname);
	}
	public void contactinfo(String name, String numb) {
		Email.sendKeys(name);
		ContactNo.sendKeys(numb);
	}
	public void resume(String path) {
		Resume.sendKeys(path);
	}
}
