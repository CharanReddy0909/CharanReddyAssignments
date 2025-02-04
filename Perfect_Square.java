package practicePackage;

import java.util.Scanner;

public class Perfect_Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c=0;
		for(int i=0;i<=n/2;i++)
		{
			if(i*i==n)
			{
				c=c+1;
			}
			
		}
		if(c==1)
		{
			System.out.println("TRUE");
		}
		else {
			System.out.println("FALSE");
		}

	}

}
