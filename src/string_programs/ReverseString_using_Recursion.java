package string_programs;

import java.util.Scanner;

public class ReverseString_using_Recursion 
{
	static int i=0;
	static String ReversedString="";
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String to be reverse:");
	String s=sc.nextLine();
	sc.close();
	System.out.println(Reverse(s));
	}
	public static String Reverse(String s)
		{	
			if(i<s.length())
				{
				ReversedString=s.charAt(i)+ReversedString;
				i++;
				Reverse(s);
				}
			return ReversedString;
		}
}
