package acitime;

public class javaStrings 
{
public static void main(String[] args)
{
	//String literals
	//stored in string pool
	//str1 and str2 are reference variable pointing to same literal
	String str1="hello";
	String str2="hello";
	
	if(str1 == str2)
	{
		System.out.println("str1 == str2");
	
	}
	else
	{
		System.out.println("str1 != str2");
	}
}
}
