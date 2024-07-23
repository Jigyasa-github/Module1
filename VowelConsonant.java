package Module1;

import java.util.Scanner;

public class VowelConsonant 
{
	public static void main(String[] args) 
	{	
		char c='w';
		int value=(int)c;
		if(value>=65 && value<=90||value>=97 && value<=122)
		{
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U' ) 
			{
				System.out.println(c + " is vowel");
			}
			else
			{
				System.out.println(c + " is consonant");
			}
		}else 
		{
			System.out.println("Error:Somthing went wrong !Try again");
		}
	}
}
