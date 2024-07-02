package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminLoginPage {
	
	
  
	@FindBy(id = "Email")
	WebElement emailIdTxtBx;
	
	@FindBy(name="Password")
	WebElement pwdTxtBx;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement loginBtn;
	
	@FindBy(xpath="//input[@type='checkbox']")
	WebElement remembermeChBx;
	
	@FindBy(xpath="//h1[contains(text(),'Dashboard')]")
	WebElement DbTitle;
	
	@FindBy(id="nopSideBarPusher")
	WebElement Menu;
	
	@FindBy(xpath="//div[@class='message-error validation-summary-errors']")
	WebElement ErrorMessage;
	
	@FindBy(xpath="//h1[contains(text(),'Admin area demo')]")
	WebElement LpTitle;
	
	@FindBy(xpath="//a[@href='/logout']")
	WebElement LogoutBtn;

	
	public WebElement getEmailIdTxtBx() {
		return emailIdTxtBx;
	}

	public WebElement getPwdTxtBx() {
		return pwdTxtBx;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	public WebElement getRemembermeChBx() {
		return remembermeChBx;
	}
	
	public WebElement getDbTitle() {
		return DbTitle;
	
	}
	
	public WebElement getMenu() {
		return Menu;
	
	}
	
	public WebElement getErrorMessage() {
		return ErrorMessage;	
	}
	
	public WebElement getLpTitle() {
		return LpTitle;	
	}
	
	public WebElement getLogoutBtn() {
		return LogoutBtn;
	}
	
	
}

