package pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class actitimelogin 
{
@FindBy(id="username")
private WebElement username;
@FindBy(name="pwd")
private WebElement password;
@FindBy(id="loginButton")
private WebElement loginbutton;

@FindBy(id="logoutLink")
private WebElement logoutbutton;

public actitimelogin(WebDriver driver1)
{
	
	PageFactory.initElements(driver1, this);
	
}
public void setusername(String un)
{
	this.username.sendKeys(un);
}
public void setpassword(String pw)
{
	this.password.sendKeys(pw);
}
public void clicklogin()
{
	this.loginbutton.click();
}
public void clicklogout()
{
	this.logoutbutton.click();
}
}
