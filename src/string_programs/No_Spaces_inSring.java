package string_programs;

import java.util.Scanner;

public class No_Spaces_inSring 
{
public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String To count spaces:");
	String s=sc.nextLine();
	sc.close();
	System.out.println("No of Spaces in given String:"+SpaceCount(s));
	}
	public static int SpaceCount(String s)
	{
	int Count=0;
	char space='a';
	char[] ch=s.toCharArray();
	for(int i=0;i<=ch.length-1;i++)
	{
		if(ch[i]==space)
		{
			Count++;
		}
	}
	return Count;
	}
}
