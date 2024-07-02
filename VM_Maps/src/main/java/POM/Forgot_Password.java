package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Forgot_Password{
	@FindBy(xpath = "//a[@routerlink='/forgot']")
	WebElement ForgotBtn;
	
	@FindBy(id = "email")
	WebElement Email;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement SubmitBtn;
	
	@FindBy(xpath="/html/body/app-root/app-forgot/div/div/div[1]/div[2]/form/div")
	WebElement F_ErrMessage;
	
	@FindBy(xpath="/html/body/app-root/app-forgot/div/div/div[1]/div[2]/form/div")
	WebElement F_SucMessage;
	
	@FindBy(xpath="/html/body/app-root")
	WebElement ForgotPage;
	
	
	public WebElement getEmail() {
		return Email;
	}
	
	public WebElement getForgotBtn() {
		return ForgotBtn;
	}
	
	public WebElement getSubmitBtn() {
		return SubmitBtn;
	}
	
	public WebElement getF_ErrMessage() {
		return F_ErrMessage;
	}
	
	public WebElement getF_SucMessage() {
		return F_SucMessage;
	}
	
	public WebElement getForgotPage() {
		return ForgotPage;
	}
	

}
