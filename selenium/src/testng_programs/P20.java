package testng_programs;
//dependency of one testcase over the another


import org.junit.Assert;
import org.testng.annotations.Test;

public class P20 
{
@Test(groups = {"smoke"})
public void method1()
{
	System.out.println("method1");
	
	
}
@Test(dependsOnGroups = {"smoke"})

	public void method2()
	{
		System.out.println("method2");
		Assert.fail(); //this will fail the test case
	}

@Test(dependsOnGroups = {"smoke"})
public void method3()
{
	System.out.println("method3");
}
@Test(dependsOnGroups = {"smoke"})
public void method4()
{
	System.out.println("method4");
}
}
