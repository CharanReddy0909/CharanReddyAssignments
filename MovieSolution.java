package practicePackage;

import java.util.ArrayList;
import java.util.Scanner;

public class MovieSolution {
	
	
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Movie[] mov=new Movie[4];
		for(int i=0;i<4;i++)
		{
			
		int movieId=sc.nextInt();
		sc.nextLine();
		String director=sc.nextLine();
		int rating = sc.nextInt();
		int budget=sc.nextInt();
		mov[i]=new Movie(movieId,director,rating,budget);
		}
		sc.nextLine();
		String searchDirector=sc.nextLine();
		int searchRating=sc.nextInt();
		int searchBudget=sc.nextInt();
		double avgBudget = findAvgBudgetByDirector(mov, searchDirector);
        if (avgBudget > 0) {
            System.out.println((int) avgBudget);
        } else {
            System.out.println("Sorry - The given director has not yet directed any movie");
        }
        Movie resultMovie = getMovieByRatingBudget(mov, searchRating, searchBudget);
        if (resultMovie != null) {
            System.out.println(resultMovie.getMovieId());
        } else {
            System.out.println("Sorry - No movie is available with the specified rating and budget requirement");
        }
		
		
	}
	
	
	public static int findAvgBudgetByDirector(Movie[] m,String director)
	{
		int s=0;
		int c=0;
		int avg=0;
		for(Movie m1:m)
		{
			if(m1.getDirector().equalsIgnoreCase(director))
			{
				s=s+m1.getBudget();
				c=c+1;
				
			}
		}
		if(c>0)
		{
			avg=s/c;
		}
		return avg;
		
	}
	
	public static Movie getMovieByRatingBudget(Movie[] mov,int rating,int budget)
	{
	
		for(Movie m1:mov)
		{
			if(m1.getRating()==rating && m1.getBudget()==budget && budget%rating==0)
			{
				return m1;
			}
		}
		return null;
	}
	
}
