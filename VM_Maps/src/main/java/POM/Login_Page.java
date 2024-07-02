package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_Page  {
	
	@FindBy(id = "email")
	WebElement Email;
	
	@FindBy(id = "password")
	WebElement Password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement SignInBtn;
	
	@FindBy(xpath="/html/body/app-root/app-login/div/div/div[1]/div[2]/form/ngb-alert")
	WebElement L_ErrMessage;
	
	@FindBy(xpath="/html/body/app-root/app-login")
	WebElement Login_Page;
	
	@FindBy(xpath="/html/body/app-root")
	WebElement DBTitle;
	
	@FindBy(xpath="//*[@id=\"mat-error-0\"]")
	WebElement Email_Err;
	
	@FindBy(xpath="//*[@id=\"mat-error-1\"]")
	WebElement Pass_Err;
	
	
	@FindBy(xpath="//input[@type='text']")
	WebElement Vis_Pass;
	
	@FindBy(xpath="/html/body/app-root/app-login/div/div/div[1]/div[2]/form/mat-form-field[2]/div/div[1]/div[2]/mat-icon")
	WebElement EyeBtn;
	
	
	public WebElement getEmail() {
		return Email;
	}
	
	public WebElement getPassword() {
		return Password;
	}	
	
    public WebElement getSignUpBtn() {
    	return SignInBtn;
    }
	
    public WebElement getL_ErrMessage() {
    	return L_ErrMessage;
    }
    
    public WebElement getLogin_Page() {
    	return Login_Page;
    }
    
    public WebElement getDBTitle() {
    	return DBTitle;
    }
    
    public WebElement getEmail_Err() {
    	return Email_Err;
    }
    
    public WebElement getPass_Err() {
    	return Pass_Err;
    }
    
    public WebElement getVis_Pass() {
    	return Vis_Pass;
    }
    
    public WebElement getEyeBtn() {
    	return EyeBtn;
    
    }

}
