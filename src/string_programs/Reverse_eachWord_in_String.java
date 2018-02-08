package string_programs;

import java.util.Scanner;

public class Reverse_eachWord_in_String 
{	
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String");
	String s=sc.nextLine();
	sc.close();
	System.out.println("Reversed words of String:"+ReveachWord(s));
	}
	public static String ReveachWord(String s)
	{	
		String[] st=s.split(" ");
		String Str="";
		for(int i=0;i<=st.length-1;i++)
		{
			char[] ar=st[i].toCharArray();
			for(int j=ar.length-1;j>=0;j--)
			{	
				Str=Str+ar[j];
			}
			Str=Str+" ";
		}
		return Str;
	}
}
