package practicePackage;

import java.util.Scanner;

public class PlayerSolution {
	
	public static double[] findAverageOfRuns(Player[] players,int target)
	{int c=0;
		for(Player ar:players)
		{
			if(target<=ar.getMatchesPlayed())
			{
				c++;
			}
			
			
		}
		
		double[] averages = new double[c];
        int index = 0;
        for(Player p : players) {
            if(p.getMatchesPlayed() >= target) {
                // Calculate the average runs scored by the player
                // It is assumed that matchesPlayed is not zero.
                double avg = (double) p.getRunsScored() / p.getMatchesPlayed();
                averages[index++] = avg;
            }
        }
        return averages;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Player[] arr=new Player[4]; 
		for(int i=0;i<arr.length;i++)
		{
			
			int id=sc.nextInt();
			sc.nextLine();
			String name=sc.nextLine();
			int iccRank=sc.nextInt();
			int matchesPlayed=sc.nextInt();
			int runsScored=sc.nextInt();
			
			arr[i]=new Player(id,name,iccRank,matchesPlayed,runsScored);
			
		}
		 int target = sc.nextInt();
		double[] averages = findAverageOfRuns(arr, target);
		for(double avg : averages) {
            if(avg >= 80 && avg <= 100) {
                System.out.println("Grade A");
            } else if(avg >= 50 && avg < 80) {
                System.out.println("Grade B");
            } else {
                System.out.println("Grade C");
            }
        }

		
	}

}
