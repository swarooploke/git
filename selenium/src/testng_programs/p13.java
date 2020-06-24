//invocationCount and priority both
package testng_programs;

import org.testng.annotations.Test;

public class p13 

{
@Test (invocationCount = 5) //if we want to execute this method more than once
public void method1()
{
	System.out.println("method1");
}
@Test (invocationCount = 2,priority = -1)
public void method2() 
{
	System.out.println("method2");
	
}
@Test (invocationCount =2,priority =-2)
public void method3()
{
	System.out.println("method3");
}
}
