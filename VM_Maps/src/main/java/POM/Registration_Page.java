package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registration_Page {
	
	@FindBy(id = "firstName")
	WebElement FirstName;
	
	@FindBy(id="lastName")
	WebElement LastName;
	
	@FindBy(id="email")
	WebElement Email;
	
	@FindBy(id="password")
	WebElement Password;
	
	@FindBy(id="verifyPassword")
	WebElement VerifyPassword;
	
	@FindBy(id="company")
	WebElement Company;
	
	@FindBy(id="serialNumber")
	WebElement S_Number;
	
	@FindBy(xpath="/html/body/app-root/app-register/div/div/div[1]/div[2]/form/div[1]/mat-checkbox")
	WebElement TC_chkbx;
	
	@FindBy(id="//mat-checkbox[@id='mat-checkbox-8']")
	WebElement PP_chkbx;
	
	@FindBy(xpath="/html/body/app-root/app-register/div/div/div[1]/div[2]/form/div[4]/button")
	WebElement SignUpBtn;
	
	@FindBy(xpath="//a[@routerlink='/register']")
	WebElement CreateBtn;
	
	@FindBy(xpath="/html/body/app-root/app-register/div/div/div[1]/div[2]/form/div[1]")
	WebElement R_ErrMessage;
	
	@FindBy(xpath="/html/body/app-root/app-register/div/div/div[1]/div[2]/form/mat-form-field[5]/div/div[3]/div/mat-error")
	WebElement R_PassError;
	
	@FindBy(xpath="/html/body/app-root/app-register/div/div/div[1]/div[2]/form/mat-form-field[8]/div/div[1]/div/mat-select/div/div[1]")
	WebElement Region;
	
	@FindBy(xpath="/html/body/div[4]/div[2]/div/div/div/mat-option[1]/span")
	WebElement R_USA;
	
	@FindBy(xpath="/html/body/div[4]/div[2]/div/div/div/mat-option[3]/span")
	WebElement R_SEA;
	
	@FindBy(xpath="/html/body/app-root")
	WebElement Regis_Page;
	
	@FindBy(xpath="/html/body/app-root/app-register/div/div/div[1]/div[1]")
	WebElement LOGO;
 	
	
	
	public WebElement getFirstName() {
		return FirstName;
	}
	
	public WebElement getLastName() {
		return LastName;
	}
	
	public WebElement getEmail() {
		return Email;
	}
	
	public WebElement getPassword() {
		return Password;
	}
	
    public WebElement getVerifyPassword() {
    	return VerifyPassword;
    }
    
    public WebElement getCompany() {
    	return Company;
    }
    
    public WebElement getS_Number() {
    	return S_Number;
    }
    
    public WebElement getTC_chkbx() {
    	return TC_chkbx;
    }
    
    public WebElement getPP_chkbx() {
    	return PP_chkbx;
    }
    
    public WebElement getSignUpBtn() {
    	return SignUpBtn;
    }
    
    public WebElement getCreateBtn() {
    	return CreateBtn;
    }
	
    public WebElement getR_ErrMessage() {
    	return R_ErrMessage;
    }
    public WebElement getR_PassError() {
    	return R_PassError;
    }
    
    public WebElement getRegion() {
    	return Region;
    }
    
    public WebElement getR_USA() {
    	return R_USA;
    }
    
    public WebElement getR_SEA() {
    	return R_SEA;
    }
    
    public WebElement getRegis_Page() {
    	return Regis_Page;
    }
    
    public WebElement getLOGO() {
    	return LOGO;
    }

}
	