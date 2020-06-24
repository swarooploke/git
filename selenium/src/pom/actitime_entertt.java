//POM PAGES ANOTHER PAGE IT IS INHERITED TO JAVASCRIPT 
package pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class actitime_entertt

{
	
	
	@FindBy(id="container_users")
	public WebElement users;
	
	@FindBy(xpath="//div[text()='  New User']")
	
	public WebElement user;	
	

	public actitime_entertt(WebDriver driver)
	{	//initializes Web Elements
		PageFactory.initElements(driver, this);
	}

}