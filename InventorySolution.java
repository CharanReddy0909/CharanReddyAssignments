package practicePackage;

import java.util.ArrayList;
import java.util.Scanner;

public class InventorySolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Inventory inv[]=new Inventory[4];
		for(int i=0;i<4;i++)
		{
			String inventoryId=sc.nextLine();
			int maximumQuantity=sc.nextInt();
			int currentQuantity=sc.nextInt();
			int threshold=sc.nextInt();
			sc.nextLine();
			inv[i]=new Inventory(inventoryId,maximumQuantity,currentQuantity,threshold);
		}
		sc.nextLine();
		int searchLimit=sc.nextInt();
		ArrayList<Inventory> a=replenish(inv,searchLimit);
		for(int j=0;j<a.size();j++)
		{
			if(a.get(j).getThreshold()>75)
			{
				System.out.println(a.get(j).getInventoryId()+" "+"Critical Filling");
			}
			else if(a.get(j).getThreshold()>50 && a.get(j).getThreshold()<=75)
			{
				System.out.println(a.get(j).getInventoryId()+" "+"Moderate Filling");
			}
			else {
				System.out.println(a.get(j).getInventoryId()+" "+"Non-Critical Filling");
			}
		}
		
		

	}
	
	
	public static ArrayList<Inventory> replenish(Inventory[] inv,int limit)
	{
		ArrayList<Inventory> al=new ArrayList<Inventory>(); 
		for(Inventory n:inv)
		{
			if(limit>=n.getThreshold())
			{
				al.add(n);
			}
		}
		return al;
	}

}
