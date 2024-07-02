package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Customer_Drop {

	
	
	@FindBy(xpath="//i[@class='nav-icon far fa-user']")
	WebElement Customer;


	@FindBy(xpath = "//a[@href='/Admin/Customer/List']")
	WebElement Customers;


	@FindBy(xpath = "//a[@href='/Admin/CustomerRole/List']")
	WebElement CustomerRole;

	
	@FindBy(xpath = "//a[@href='/Admin/OnlineCustomer/List']")
	WebElement OnlineCustomer;

	
    @FindBy(xpath = "//a[@href='/Admin/Vendor/List']")
	WebElement Vendors;

    
	@FindBy(xpath = "//a[@href='/Admin/ActivityLog/ActivityLogs']")
	WebElement ActivityLog;
	

	public WebElement getCustomer(){
	return Customer;
	}
	
	public WebElement getCustomers(){
	return Customers;
	}
	
	public WebElement getCustomerRole(){
	return CustomerRole;
	}
	
	public WebElement getOnlineCustomer(){
	return OnlineCustomer;
	}
	
	public WebElement getVendors(){
	return Vendors;
	}

	
	public WebElement getActivityLog(){
	return ActivityLog;
	}


















}
