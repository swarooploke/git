package testng_programs;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class P21 
{
@Test
public void method1()
{
	System.out.println("method1");
}
@Test
public void method2()
{
	Reporter.log("method2",true);
	
}
@Test
public void method3()
{
Reporter.log("method3",false);
}

}
