package practicePackage;

import java.util.Scanner;

public class NavalVesselSolution {
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		NavalVessel[] nv=new NavalVessel[4];
		for(int i=0;i<4;i++)
		{
			int vesselId=sc.nextInt();
			sc.nextLine();
			String vesselName=sc.nextLine();
			int noOfVoyagesPlanned=sc.nextInt();
			int noOfVoyagesCompleted=sc.nextInt();
			sc.nextLine();
			String purpose=sc.nextLine();
			
			nv[i]=new NavalVessel(vesselId,vesselName,noOfVoyagesPlanned,noOfVoyagesCompleted,purpose ); 
			
			
		}
		int searchPercentage=sc.nextInt();
		sc.nextLine();
		String searchPurpose=sc.nextLine();
		System.out.println(findAvgVoyagesByPct(nv,searchPercentage));
		if(findVesselByGrade(nv,searchPurpose)==null)
		{
			System.out.println("No Naval Vessel is available with the specified purpose");
		}
		NavalVessel resultVessel = findVesselByGrade(nv, searchPurpose);
        if (resultVessel != null) {
            System.out.println(resultVessel.getVesselName() + "%" + resultVessel.getClassification());
        }
		
	}
	
	public static int findAvgVoyagesByPct(NavalVessel[] nv,int percentage)
	{	int c=0;
		int avg=0;
		int s=0;
		
		for(NavalVessel n:nv)
		{
			
			if (n.getNoOfVoyagesPlanned() > 0) {
			     int perc = (n.getNoOfVoyagesCompleted() * 100) / n.getNoOfVoyagesPlanned();
			    if (perc >= percentage) {
			        s += n.getNoOfVoyagesCompleted();
			        c++;
			    }
			}

		}
		if(c>0) {
		return avg=s/c;}
		return 0;
	}
	
	public static NavalVessel findVesselByGrade(NavalVessel[] nv,String purpose)
	
	{
		
		
		
		for(NavalVessel n:nv)	
		{
			int perc=((n.getNoOfVoyagesCompleted()*100)/n.getNoOfVoyagesPlanned());
			if(n.getPurpose().equalsIgnoreCase(purpose))
			{
				if(perc==100)
				{
					n.setClassification("Star");
				}
				else if(perc>81 && perc<99)
				{
					n.setClassification("Leader");
				}
				else if(perc>56 && perc<79)
				{
					n.setClassification("Inspirer");
				}
				else {
					n.setClassification("Striver");
				}
				return n;
			}
			
		}
		return null;
		
	}
	
}
