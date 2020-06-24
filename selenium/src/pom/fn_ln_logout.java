package pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class fn_ln_logout

{
	
	
	@FindBy(id="createUserPanel_firstNameField")
	public WebElement firstname;
	
	@FindBy(id="createUserPanel_middleNameField")
	
	public WebElement middlename;	
	
	@FindBy(id="createUserPanel_lastNameField")
	
	public WebElement lastname;
	
	@FindBy(id="createUserPanel_emailField")
	public WebElement email;
	
	@FindBy(xpath="//div[text()='  Save & Send Invitation']")
	public WebElement submit;
	@FindBy(xpath="//span[text()='Close']")
	public WebElement close;
	
	@FindBy(id="logoutLink")
	public WebElement logoutbutton;
	
	
	public fn_ln_logout(WebDriver driver)
	{	//initializes Web Elements
		PageFactory.initElements(driver, this);
	}

}