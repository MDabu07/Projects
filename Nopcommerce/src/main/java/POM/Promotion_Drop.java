package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Promotion_Drop {
	
	@FindBy(xpath="//i[@class='nav-icon fas fa-tags']")
	WebElement Promotion;


	@FindBy(xpath="//a[@href='/Admin/Discount/List']")
	WebElement Discounts;


	@FindBy(xpath="//a[@href='/Admin/Affiliate/List']")
	WebElement Affiliates;
	
	@FindBy(xpath="//a[@href='Edit/2']")
	WebElement Edit;

	@FindBy(xpath="//input[@id='IsActive']")
	WebElement CheckBox;
	
	@FindBy(xpath="//button[@name='save']")
	WebElement SaveBtn;

	
	public WebElement getPromotion(){
	return Promotion;
	}
	
	public WebElement getDiscounts(){
	return Discounts;
	}
	
	public WebElement getAffiliates(){
	return Affiliates;
	}
	
	public WebElement getEdit(){
	return Edit;
	}
	
	public WebElement getCheckBox(){
	return CheckBox;
	}
	
	public WebElement getSaveBtn(){
	return SaveBtn;
	}
}
