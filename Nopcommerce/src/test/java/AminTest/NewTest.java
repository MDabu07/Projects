package AminTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM.AdminLoginPage;
import POM.Catalog_drop;
import POM.Customer_Drop;
import POM.Promotion_Drop;
import POM.Sales_Drop;


public class NewTest{
	
	public static WebDriver driver;
	public static AdminLoginPage alp;
	public static Promotion_Drop PD;
	public static Catalog_drop CAD;
	public static Customer_Drop CUD;
	public static Sales_Drop SD;	
	
	@BeforeMethod
	public void beforemethod(){
		
		driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		driver.manage().window().maximize();
		driver.findElement(By.name("Email")).clear();
		driver.findElement(By.name("Password")).clear();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		alp = PageFactory.initElements(driver, AdminLoginPage.class);
		PD = PageFactory.initElements(driver, Promotion_Drop.class);
		SD = PageFactory.initElements(driver, Sales_Drop.class);
		CAD = PageFactory.initElements(driver, Catalog_drop.class);
		CUD = PageFactory.initElements(driver, Customer_Drop.class);
		
		
		}

  @Test
  public void TC_001(){
	  	  
	  alp.getEmailIdTxtBx().sendKeys("admin@yourstore.com");
	  alp.getPwdTxtBx().sendKeys("admin");
	  alp.getLoginBtn().click();
	  boolean actual= alp.getDbTitle().isDisplayed();
	  Assert.assertTrue(actual);
	  
  }
	  
  @Test
  public void TC_002() {
	  
	  alp.getEmailIdTxtBx().sendKeys("Mohamedabuthakir786@gmail.com");
	  alp.getPwdTxtBx().sendKeys("admin");
	  alp.getLoginBtn().click();
	  boolean actual = alp.getErrorMessage().isDisplayed();
	  Assert.assertTrue(actual);
	  
  }
  
  @Test
  
  public void TC_013() throws InterruptedException {
	  
	  alp.getEmailIdTxtBx().sendKeys("admin@yourstore.com");
	  alp.getPwdTxtBx().sendKeys("admin");
	  alp.getLoginBtn().click();
	  Thread.sleep(5000);
	  alp.getLogoutBtn().click();
	  boolean actual= alp.getLpTitle().isDisplayed();
	  Assert.assertTrue(actual);
	  
  }
  
  @Test
  
  public void TC_006() {
	  
	  alp.getEmailIdTxtBx().sendKeys("admin@yourstore.com");
	  alp.getPwdTxtBx().sendKeys("admin");
	  alp.getLoginBtn().click();
	  PD.getPromotion().click();
	  PD.getDiscounts().click();
	  PD.getEdit().click();
	  PD.getCheckBox().click();
	  PD.getSaveBtn().click();
	  PD.getEdit().click();
	  boolean actual = PD.getCheckBox().isSelected();
	  Assert.assertTrue(actual);
	  }
  
  @Test
  
  public void TC_005() {
	  
	  alp.getEmailIdTxtBx().sendKeys("admin@yourstore.com");
	  alp.getPwdTxtBx().sendKeys("admin");
	  alp.getLoginBtn().click();
	  SD.getsales().click();
	  SD.getShipments().click();
	  SD.getS_View1().click();
	  SD.getS_TN().sendKeys("987654321");
	  SD.getS_SetTN().click();
	  SD.getShipments().click();
	  SD.getS_View1().click();
	  boolean actual = SD.getS_SettedTN().isDisplayed();
	  Assert.assertTrue(actual);
	  }
  
  
  
  @AfterMethod
	public void aftermethod() {
		driver.close();
	}
  
}
