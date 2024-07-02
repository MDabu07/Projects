package User_Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM.Forgot_Password;
import POM.Login_Page;
import POM.Registration_Page;

public class Test_Cases  {
	
	public static Forgot_Password FP;
	public static Login_Page LP;
	public static Registration_Page RP;
	public static WebDriver driver;
	
	@BeforeMethod
	public void beforemethod() {
		
		driver = new ChromeDriver();
		driver.get("https://vmmap.vivax-metrotech.com/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    FP = PageFactory.initElements(driver, Forgot_Password.class);
	    LP = PageFactory.initElements(driver, Login_Page.class);
	    RP = PageFactory.initElements(driver, Registration_Page.class);
	    
	}
	
	
	@Test
	public void TC_001(){
		
		RP.getCreateBtn().click();
		RP.getFirstName().sendKeys("Abu");
		RP.getLastName().sendKeys("K");
		RP.getEmail().sendKeys("abu@gmail.com");
		RP.getPassword().sendKeys("Abuthakir-9");
		RP.getVerifyPassword().sendKeys("Abuthakir-9");
		RP.getCompany().sendKeys("ATS");
		RP.getS_Number().sendKeys("987456123567");
	    RP.getSignUpBtn().click();
		boolean actual= RP.getR_ErrMessage().isDisplayed();
		Assert.assertTrue(actual);
		
		}
	
	@Test
	public void TC_002(){
		
		RP.getCreateBtn().click();
		RP.getFirstName().sendKeys("Abu");
		RP.getLastName().sendKeys("K");
		RP.getEmail().sendKeys("abuthakir");
		RP.getPassword().sendKeys("Abuthakir-9");
		RP.getVerifyPassword().sendKeys("Abuthakir-9");
		RP.getCompany().sendKeys("ATS");
		RP.getS_Number().sendKeys("987456123567");
	    RP.getSignUpBtn().click();
		boolean actual= RP.getR_ErrMessage().isDisplayed();
		Assert.assertTrue(actual);
		
		}
	
	@Test
	public void TC_003(){
		
		RP.getCreateBtn().click();
		RP.getFirstName().sendKeys("Abu");
		RP.getLastName().sendKeys("K");
		RP.getEmail().sendKeys("abuthakir@gmail.com");
		RP.getPassword().sendKeys("Abuthakir-97");
		RP.getVerifyPassword().sendKeys("Abuthakir-9");
		RP.getCompany().sendKeys("ATS");
		RP.getS_Number().sendKeys("987456123567");
		boolean actual= RP.getR_PassError().isDisplayed();
		Assert.assertTrue(actual);
		
		}
	
	@Test
	public void TC_004(){
		
		RP.getCreateBtn().click();
		RP.getFirstName().sendKeys("Abu");
		RP.getLastName().sendKeys("K");
		RP.getEmail().sendKeys("abuthakir@gmail.com");
		RP.getPassword().sendKeys("Abuthakir-9");
		RP.getVerifyPassword().sendKeys("Abuthakir-9");
		RP.getCompany().sendKeys("ATS");
		RP.getS_Number().sendKeys("987456");
		RP.getRegion().click();
		RP.getR_SEA().click();
		RP.getSignUpBtn();
		boolean actual= RP.getR_ErrMessage().isDisplayed();
		Assert.assertTrue(actual);
		
		}
	
	@Test
	public void TC_005(){
		
		RP.getCreateBtn().click();
		RP.getFirstName().sendKeys("Abu");
		RP.getLastName().sendKeys("K");
		RP.getEmail().sendKeys("abuthakir@gmail.com");
		RP.getPassword().sendKeys("Abuthakir-9");
		RP.getVerifyPassword().sendKeys("Abuthakir-9");
		RP.getCompany().sendKeys("ATS");
		RP.getS_Number().sendKeys("987456");
		RP.getRegion().click();
		RP.getR_SEA().click();
		RP.getSignUpBtn();
		boolean actual= RP.getR_ErrMessage().isDisplayed();
		Assert.assertTrue(actual);
		
		}
	
	@Test
	public void TC_006(){
		
		RP.getCreateBtn().click();
		RP.getFirstName().sendKeys("Abu");
		RP.getLastName().sendKeys("K");
		RP.getEmail().sendKeys("abuthakir@gmail.com");
		RP.getPassword().sendKeys("Abuthakir-9");
		RP.getVerifyPassword().sendKeys("Abuthakir-9");
		RP.getCompany().sendKeys("ATS");
		RP.getS_Number().sendKeys("98745654321785");
		RP.getRegion().click();
		RP.getR_SEA().click();
		RP.getTC_chkbx().click();
		RP.getPP_chkbx().click();
		RP.getSignUpBtn();
		boolean actual= LP.getLogin_Page().isDisplayed();
		Assert.assertTrue(actual);
		
		}
	
	@Test
	public void TC_007() {
		
		LP.getEmail().sendKeys("Shinchan4208@gmail.com");
		LP.getPassword().sendKeys("Shinchan@4208");
		LP.getSignUpBtn().click();
		boolean actual= LP.getDBTitle().isDisplayed();
		Assert.assertTrue(actual);
		
	}
	
	@Test
	public void TC_008() {
		
		LP.getEmail().sendKeys("Shinchan4208@gmail.com");
		LP.getPassword().sendKeys("Shinchan@42");
		LP.getSignUpBtn().click();
		boolean actual= LP.getL_ErrMessage().isDisplayed();
		Assert.assertTrue(actual);
		
	}
	
	@Test
	public void TC_009() throws InterruptedException {
		
		LP.getEmail().sendKeys("Shinchan4208@gmail.com");
		LP.getPassword().sendKeys("Shinchan@4208");
		LP.getSignUpBtn().click();
		Thread.sleep(3000);
		driver.navigate().back();
		boolean actual= LP.getL_ErrMessage().isDisplayed();
		Assert.assertTrue(actual);
		
	}
	
	
	@Test
	public void TC_010() throws InterruptedException {
		
		RP.getCreateBtn().click();
		boolean actual= RP.getRegis_Page().isDisplayed();
		Assert.assertTrue(actual);
		
	}
	
	@Test
	public void TC_011() throws InterruptedException {
		
		LP.getSignUpBtn().click();
		boolean actual= LP.getEmail_Err().isDisplayed();
		Assert.assertTrue(actual);
		
	}
	
	@Test
	public void TC_012() throws InterruptedException {
		
		LP.getEmail().sendKeys("Shinchan4208@gmail.com");
		LP.getPassword().sendKeys("Shinchan@4208");
		LP.getEyeBtn().click();
		boolean actual= LP.getVis_Pass().isDisplayed();
		Assert.assertTrue(actual);
		
	}
	
	
	
	@Test
	public void TC_013() throws InterruptedException {
		
    FP.getForgotBtn().click();
	boolean actual= FP.getForgotPage().isDisplayed();
	Assert.assertTrue(actual);
		
	}
	
	
	@Test
	public void TC_014() throws InterruptedException {
		
    FP.getForgotBtn().click();
    FP.getEmail().sendKeys("Shinvhvs@gmail.com");
	boolean actual= FP.getF_ErrMessage().isDisplayed();
	Assert.assertTrue(actual);
		
	}
	
	@Test
	public void TC_015() throws InterruptedException {
		
    FP.getForgotBtn().click();
    FP.getEmail().sendKeys("Shinchan4208@gmail.com");
    FP.getSubmitBtn().click();
	boolean actual= FP.getForgotPage().isDisplayed();
	Assert.assertTrue(actual);
		
	}
	
	@Test
	public void TC_016() throws InterruptedException {
		
    FP.getForgotBtn().click();
    FP.getEmail().sendKeys("Shinchan4208@gmail.com");
    FP.getSubmitBtn().click();
	boolean actual= FP.getF_SucMessage().isDisplayed();
	Assert.assertTrue(actual);
		
	}
	
	@Test
	public void TC_017() throws InterruptedException {
		
    RP.getCreateBtn().click();
    RP.getLOGO().click();
	boolean actual= LP.getLogin_Page().isDisplayed();
	Assert.assertTrue(actual);
		
	}

	
	@AfterMethod
	public void aftermethod() {
		
		driver.quit();
		
	}

}
