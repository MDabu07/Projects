package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Catalog_drop {

	@FindBy(xpath="//i[@class='nav-icon fas fa-book']")
	WebElement Catalog;


	@FindBy(xpath="//a[@href='/Admin/Product/List']")
	WebElement Products;


	@FindBy(xpath="//a[@href='/Admin/Manufacturer/List']")
	WebElement Manufacturers;


	@FindBy(xpath="//a[@href='/Admin/ProductReview/List']")
	WebElement ProductReviews;


	@FindBy(xpath="//a[@href='/Admin/Product/ProductTags']")
	WebElement ProductTags;


	
	public WebElement getCatalog(){
	return Catalog;
	}
	
	public WebElement getProducts(){
	return Products;
	}
	
	public WebElement getManufacturers(){
	return Manufacturers;
	}
	
	public WebElement getProductReviews(){
	return ProductReviews;
	}
	
	public WebElement getProductTags(){
	return ProductTags;
	}















	
	
}
