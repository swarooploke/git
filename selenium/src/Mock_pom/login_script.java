package Mock_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_script
{
@FindBy(id="email")
private WebElement username;

@FindBy(name="pass")
private WebElement password;
@FindBy(id="loginbutton")
private WebElement loginbutton;

public login_script(WebDriver driver)
{
	
	PageFactory.initElements(driver, this);
	
}

public void setusername(String un)
{
	this.username.sendKeys(un);
}
public void setpassword(String pw)
{
	this.password.sendKeys(pw);
}
public void setloginbutton()
{
	this.loginbutton.click();
}
}
