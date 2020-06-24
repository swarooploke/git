package testng_programs;


import org.testng.annotations.Test;

public class P19
{
@Test(groups = {"smoke"})
public void method1()
{
	System.out.println("method1");
}
@Test(groups = {"smoke","functional"})
public void method2()
{
	System.out.println("method2");
}
@Test(groups= {"functional"})
public void method3()
{
	System.out.println("method3");
}
@Test(groups = {"integration"})
public void method4()
{
	System.out.println("method4");
}
}