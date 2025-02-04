package practicePackage;

import java.util.ArrayList;
import java.util.Scanner;

public class SolutionMovieGenre {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		MovieGenre a[]=new MovieGenre[4];
		for(int i=0;i<4;i++)
		{
			String movieName=sc.nextLine();
			String company=sc.nextLine();
			String genre=sc.nextLine();
			int budget=sc.nextInt();
			sc.nextLine();
			a[i]=new MovieGenre(movieName,company,genre,budget);
			
			
		}
		
		String searchGenre=sc.nextLine();
		ArrayList<MovieGenre> al2=getMovieByGenre(a,searchGenre);
		for(MovieGenre m1:al2)
		{
			if(m1.getBudget()>80000000)
			{
				System.out.println("High Budget");
			}
			else {
				System.out.println("low Budget");
			}
		}
		
		
	

	}
	
	
	public static ArrayList<MovieGenre> getMovieByGenre(MovieGenre[] mov,String searchGenre)
	{
		ArrayList<MovieGenre> al=new ArrayList<MovieGenre>();
		for(MovieGenre m:mov)
		{
			if(m.getGenre().equalsIgnoreCase(searchGenre))
			{
				al.add(m);
			}
		}
		return al;
	}
}

