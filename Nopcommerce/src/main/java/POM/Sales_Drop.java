package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Sales_Drop {
	
	@FindBy(xpath="//i[@class='nav-icon fas fa-shopping-cart']")
	WebElement sales;

	
	@FindBy(xpath="//a[@href='/Admin/Order/List']")
	WebElement Orders;


	@FindBy(xpath="//a[@href='/Admin/Order/ShipmentList']")
	WebElement Shipments;


	@FindBy(xpath="//a[@href='/Admin/GiftCard/List']")
	WebElement GiftCards;


	@FindBy(xpath="//a[@href='Edit/4']")
	WebElement O_View2;


	@FindBy(id="btnChangeOrderStatus")
	WebElement changeStatus;


	@FindBy(xpath="//button[@class='btn btn-primary mt-1 mr-1']")
	WebElement SaveBtn;
	

	@FindBy(xpath="//a[@href='Edit/3']")
	WebElement O_View3;


	@FindBy(xpath="//a[@href='Edit/3']")
	WebElement Markaspaid;

	
	@FindBy(xpath="//a[@href='/Admin/Order/ShipmentDetails/3']")
	WebElement S_View1;

	
	@FindBy(id="TrackingNumber")
	WebElement S_TN;
	
	
	@FindBy(name="settrackingnumber")
	WebElement S_SetTN;
	
	@FindBy(xpath="//input[@data-gtm-form-interact-field-id='987654321']")
	WebElement S_SettedTN;
	
	public WebElement getsales(){
	return sales;
	}
	
	public WebElement getOrders(){
	return Orders;
	}
	
	public WebElement getShipments(){
	return Shipments;
	}
	
	public WebElement getGiftCards(){
	return GiftCards;
	}

	public WebElement getO_View2(){
	return O_View2;
	}
	
	public WebElement getchangeStatus(){
	return changeStatus;
	}
	
	public WebElement getSaveBtn(){
	return SaveBtn;
	}

	public WebElement getO_View3(){
	return O_View3;
	}
	
	public WebElement getMarkaspaidBtn(){
	return Markaspaid;
	}
	
	public WebElement getS_View1(){
	return S_View1;
	}
	
	public WebElement getS_TN(){
	return S_TN;
	}
	
	public WebElement getS_SetTN(){
	return S_SetTN;
	}
	
	public WebElement getS_SettedTN(){
	return S_SettedTN;
	}
	

}
