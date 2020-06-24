package testng_programs;

import org.testng.annotations.Test;

public class P18
{
@Test
public void login_script()
{
	System.out.println("login_script");
}
@Test(dependsOnMethods = {"login_script"})
public void users_script()
{
	System.out.println("users_script");
}
@Test(dependsOnMethods = {"login_script","users_script"})
public void logout_script()
{
	System.out.println("logout_script");
}
@Test(dependsOnMethods = {"login_script"})
public void reports_script()
{
	System.out.println("reports_script");
}
}

