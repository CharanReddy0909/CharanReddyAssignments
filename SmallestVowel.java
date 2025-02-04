package practicePackage;

import java.util.Scanner;

public class SmallestVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
System.out.println(vowel(s));
	}

	
	
	public static char vowel(String s)
	{
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a')
			{
				return s.charAt(i);
			}
			
			else if(s.charAt(i)=='e')
			{
				return s.charAt(i);
			}
			else if(s.charAt(i)=='i')
			{
				return s.charAt(i);
			}
			else if(s.charAt(i)=='o')
			{
				return s.charAt(i);
			}
			else if(s.charAt(i)=='u')
			{
				return s.charAt(i);
			}
			
			
			
		}
		return 0;
	}
}
