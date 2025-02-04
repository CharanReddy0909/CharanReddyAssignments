package practicePackage;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int res=0;
		while(n>0)
		{
			
			int l=n%10;
			res=res*10+l;
			n=n/10;
			
		}
		System.out.println(res);

	}

}
