package string_programs;

import java.util.Scanner;

public class SwapFirst_with_last_character_in_String 
{
	static String str="";
public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String s=sc.nextLine();
		sc.close();
		System.out.println("resulted String:"+FirstWithLast(s));
	}
public static String FirstWithLast(String s)
	{
	char temp;
	String Result="";
	String[] st=s.split(" ");
	  for(int i=0;i<=st.length-1;i++)
       {
		String word="";
		char[] ar=st[i].toCharArray();
		for(int j=0;j<ar.length;j++)
		{
		  temp=ar[0];
		  ar[0]=ar[ar.length-1];
		  ar[ar.length-1]=temp;
		  word=word+ar[j];
		}
		Result=Result+word;
		Result=Result+" ";
	  }
	  return Result;
	}
}
	