package Pratice;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class work_space {
	public static WebDriver driver;
	
	@SuppressWarnings("deprecation")
	@BeforeMethod
	public void beforemethod(){
		
		driver = new ChromeDriver();
		driver.get("https://letcode.in/test");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void input() {
		driver.findElement(By.xpath("//a[@href='/edit']")).click();
		
		//To enter the value in Text Box
		driver.findElement(By.id("fullName")).sendKeys("Abuthakir");
		
		//To append the value in Text Box and enter Tab Key
		driver.findElement(By.id("join")).sendKeys("person", Keys.TAB);
		
		//To get the attribute of the Textbox
		String Myvalue = driver.findElement(By.id("getMe")).getAttribute("value");
		System.out.println(Myvalue);
		
		//To clear the value in the Text Box
		driver.findElement(By.id("clearMe")).clear();
		
		//To find the Textbox is Non edit
		boolean NonEdit = driver.findElement(By.id("noEdit")).isEnabled();
		System.out.println(NonEdit);
		
		//To find the Text box is in Readonly
		String IsRead = driver.findElement(By.id("dontwrite")).getAttribute("readonly");
		System.out.println(IsRead);
	}
	
	@Test
	public void buttons() {
		
		//To click back button 
		driver.findElement(By.xpath("//a[@href='/buttons']")).click();
		driver.findElement(By.id("home")).click();
		String Url = driver.getCurrentUrl();
		System.out.println(Url);
		driver.navigate().back();
		
		//To get the Button color
		WebElement Btncolor = driver.findElement(By.id("color"));
		String color = Btncolor.getCssValue("background-color");
		System.out.println(color);
		
		//To get the dimension of an element
		Rectangle rect = driver.findElement(By.id("property")).getRect();
		Dimension dime = rect.getDimension();
		System.out.println(dime);
		
		//To Check the Text Box is disabled
		boolean isenabled = driver.findElement(By.id("isDisabled")).isEnabled();
		System.out.println(isenabled);	
		
	}
	@Test
	public void CaptureSS() throws IOException {
		
		//Take a Screenshot of whole Screen
		driver.findElement(By.xpath("//a[@href='/buttons']")).click();
		TakesScreenshot tk = (TakesScreenshot)driver;
		File f1 = tk.getScreenshotAs(OutputType.FILE);
		File Dest = new File("./snaps/img.png");
		FileHandler.copy(f1, Dest);
		
		//Take a screenshot of Particular Element
		WebElement ele = driver.findElement(By.id("home"));
		File f2 = ele.getScreenshotAs(OutputType.FILE);
		File Dest1 = new File("./snaps/img1.png");
		FileHandler.copy(f2, Dest1);
	}
	
	@Test
	public void HadnlingAlerts() throws InterruptedException {
		
		//handle a simple alert
		driver.findElement(By.xpath("//a[@href='/alert']")).click();
		driver.findElement(By.id("accept")).click();
		driver.switchTo().alert().accept();
		
		//handle a confirm & dismiss alert
		driver.findElement(By.id("confirm")).click();
		driver.switchTo().alert().dismiss();		
		
		//handle a prompt alert
		driver.findElement(By.id("prompt")).click();
		driver.switchTo().alert().sendKeys("hello");
		driver.switchTo().alert().accept();
		
	}
	
	@Test
	public void DropDown() {
		//select a option from the dropdown
		driver.findElement(By.xpath("//a[@href='/dropdowns']")).click();
		WebElement Fruits = driver.findElement(By.id("fruits"));
		Select Myfruit = new Select(Fruits);
		
		//Select option with Visible Text
		Myfruit.selectByVisibleText("Apple");
		
		//select multi option from the dropdown
		WebElement SuperHero = driver.findElement(By.id("superheros"));
		Select MyHero = new Select(SuperHero);
		
		//Select option with Index 
		MyHero.selectByIndex(1);
		
		//Select the option with Value
		MyHero.selectByValue("bt");
		
		//Deselect option with Visible Text
		MyHero.deselectByVisibleText("Aquaman");
		
	}
	
	@Test
	public void HandleFrames() {
	
		driver.navigate().to("https://letcode.in/frame");
		
		//Switch to Iframe and use sendkeys
		WebElement Myframe = driver.findElement(By.xpath("//iframe[@src='frameUI']"));
		driver.switchTo().frame(Myframe);
		driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("MD");
		driver.findElement(By.xpath("//input[@name='lname']")).sendKeys("abu");
		
		//Switch to child frame and use sendkeys
		WebElement Myframe1 = driver.findElement(By.xpath("//iframe[@src='innerFrame']"));
		driver.switchTo().frame(Myframe1);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("email");
		
		
	    //Switch back to Parent frame
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//input[@name='lname']")).sendKeys("thakir");
		
		//Switch back to main frame
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[@class='card-footer-item']")).click();
		
		}
	
	@Test
	public void Drag(){
		
		driver.navigate().to("https://letcode.in/draggable");
		WebElement ele = driver.findElement(By.id("sample-box"));
		Actions builder = new Actions(driver);
		builder.dragAndDropBy(ele, 75, 90).build().perform();
		
	}
	@Test
	public void Drop() {
		
		driver.navigate().to("https://letcode.in/dropable");
		WebElement source =driver.findElement(By.id("draggable"));
		WebElement Target =driver.findElement(By.id("droppable"));
		Actions builder = new Actions(driver);
		builder.dragAndDrop(source, Target).build().perform();
	}
	
	
	
	@AfterMethod
	public void aftermethod() { 
		
		driver.close();
	}
	
}
