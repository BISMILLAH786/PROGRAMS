package string_programs;

import java.util.Scanner;

public class ReverseString_TocharArray
{
public static void main(String[] args) 
	{
	Scanner  sc=new Scanner(System.in);
	System.out.println("Enter the String to be reverse:");
	String s=sc.next();
	sc.close();
	Reverse(s);
	}
	public static void Reverse(String Rev)
	{
		char[] ch=Rev.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}
	}
}
