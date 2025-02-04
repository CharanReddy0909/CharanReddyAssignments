package practicePackage;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String res="";
		for(int i=s.length()-1;i>=0;i--)
		{
			res=res+s.charAt(i);
		}
		System.out.println(res);
	}

}
