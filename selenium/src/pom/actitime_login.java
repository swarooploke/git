//POM PAGES ANOTHER PAGE IT IS INHERITED TO JAVASCRIPT 
package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class actitime_login

{
	@FindBy(id="username")
	public WebElement username;
	
	@FindBy (name="pwd")
	public WebElement password;
	
	@FindBy(id="loginButton")
	public WebElement loginbutton;
	
	public actitime_login(WebDriver driver)
	{	//initializes Web Elements
		PageFactory.initElements(driver, this);
	}

}
