package string_programs;

import java.util.Scanner;

public class ReverseString_CharAt 
{
public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the String to be reverse:");
	String s=sc.nextLine();
	sc.close();
	System.out.println(Reverse(s));
	}
	public static String Reverse(String s)
	{
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		return rev;
	}
}
