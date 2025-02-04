package practicePackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MedicineSolution {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Medicine[] m=new Medicine[4];
		for(int i=0;i<4;i++)
		{
			String MedicineName=sc.nextLine();
			String batch=sc.nextLine();
			String disease=sc.nextLine();
			int price=sc.nextInt();
			sc.nextLine();
			 m[i]=new Medicine(MedicineName,batch,disease,price);
			
		}
		
		String searchDisease=sc.nextLine();
		ArrayList<Integer> res=getPriceByDisease(m,searchDisease);
		
		for(int price:res)
		{
			System.out.println(price);
			
		}
		

	}
	
	
	public static ArrayList<Integer> getPriceByDisease(Medicine[] arr,String disease)
	{
		ArrayList<Integer> prices=new ArrayList<Integer>(); 
		for(Medicine m:arr)
		{
			if(m.getDisease().equalsIgnoreCase(disease))
			{
				prices.add(m.getPrice());
			}
		}
		 Collections.sort(prices);
	        return prices;
	}

}
