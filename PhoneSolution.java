package practicePackage;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneSolution {
	
	
	public static int findPriceForGivenBrand(Phone[] phn,String brand)
	{
	int s=0;
		for(Phone p:phn)
		{
			if(p.getBrand().equalsIgnoreCase(brand)) {
				s=s+p.getPrice();
			}
		}
		return s;
	}
	
	public static Phone getPhoneIdBasedOnOs(Phone[] phn,String os)
	{
		ArrayList<Phone> al=new ArrayList<Phone>();
		for(Phone p1:phn)
		{
			if(p1.getOs().equalsIgnoreCase(os))
			{
				if(p1.getPrice()>=50000)
				{
					return p1;
				}
			}
		}
		return null;
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone phn[]=new Phone[4];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<4;i++)
		{
			
			int phoneId=sc.nextInt();
			sc.nextLine();
			String os=sc.nextLine();
			String brand=sc.nextLine();
			int price=sc.nextInt();
			phn[i]=new Phone(phoneId,os,brand,price);
		}
		sc.nextLine();
		String searchBrand=sc.nextLine();
		String searchOs=sc.nextLine();
		int price=findPriceForGivenBrand(phn,searchBrand);
		if(price>0)
		{
			System.out.println(price);
		}
		else {
			System.out.println("The given Brand is not available");
		}
		Phone res=getPhoneIdBasedOnOs(phn,searchOs);
	
		if (res != null) {
            System.out.println(res.getPhoneId());
        } else {
            System.out.println("No phones are available with specified os and price range");
        }
		
	
		
	}
	
	
	

}
