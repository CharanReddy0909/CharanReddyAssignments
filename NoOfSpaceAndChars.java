package practicePackage;

import java.util.Scanner;

public class NoOfSpaceAndChars {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
			int s1=0;
		int c=0;
		for(int i=0;i<s.length();i++)
		{
			if(Character.isLetter(s.charAt(i)))
					{
				c=c+1;
					}
			else if(s.charAt(i)==' ')
			{
				s1=s1+1;
			}
		}
		System.out.println(s1);
		System.out.println(c);
		
		sc.close();
	}
	

}
