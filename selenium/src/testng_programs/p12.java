package testng_programs;

import org.testng.annotations.Test;

public class p12 
{
@Test(priority = 3)
public void Bmethod1() {
	System.out.println("BMMETHOD1");
}
@Test(priority = 1)
public void Amethod2()
{
	System.out.println("AMETHOD1");
	
}
@Test(priority = 2)
public void Cmethod3()
{
	System.out.println("CMETHOD3");
}
}
