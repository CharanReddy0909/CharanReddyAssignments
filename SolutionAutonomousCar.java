package practicePackage;
import java.util.*;
public class SolutionAutonomousCar {
	
	public static int  findTestPassedByEnv(AutonomousCar[] cars,String environment )
	{
		int totalTestPassed=0;
		for(AutonomousCar car:cars)
		{
			if(car.getenvironment().equalsIgnoreCase(environment))
			{
				totalTestPassed+=car.getnoOfTestsPassed();
			}
		}
		return totalTestPassed;
		
	}
	
	
	
	public static AutonomousCar updateCarGrade(AutonomousCar[] cars,String brand)
	{
		for(AutonomousCar car:cars)
		{
			if(car.getbrand().equalsIgnoreCase(brand))
			{
				if(car.getnoOfTestsConducted()>0)
				{
					int rating=(car.getnoOfTestsPassed()*100/car.getnoOfTestsConducted());
					car.setgrade(rating >=80? "A1" : "B2");
				}
				return car;
			}
			
		}
		return null;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		AutonomousCar[] cars=new AutonomousCar[4];
		for(int i=0;i<cars.length;i++)
		{
			int carId=sc.nextInt();
			sc.nextLine();
			String brand=sc.nextLine();
			int noOfTestsConducted = sc.nextInt();
            int noOfTestsPassed = sc.nextInt();
            sc.nextLine();
            String environment = sc.nextLine();
            cars[i] = new AutonomousCar(carId, brand, noOfTestsConducted, noOfTestsPassed, environment);
			
		}
		 String searchEnvironment = sc.nextLine();
	        String searchBrand = sc.nextLine();

	        // Calling methods and displaying results
	        int totalTestsPassed = findTestPassedByEnv(cars, searchEnvironment);
	        if (totalTestsPassed > 0) {
	            System.out.println(totalTestsPassed);
	        } else {
	            System.out.println("There are no tests passed in this particular environment");
	        }

	        AutonomousCar resultCar = updateCarGrade(cars, searchBrand);
	        if (resultCar != null) {
	            System.out.println(resultCar.getbrand() + "::" + resultCar.getgrade());
	        } else {
	            System.out.println("No Car is available with the specified brand");
	        }

	        sc.close();
		
		
		

	}

}
