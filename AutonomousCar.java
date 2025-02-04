package practicePackage;

public class AutonomousCar {
	private int carId;
	private String brand;
	private int noOfTestsConducted;
	private int noOfTestsPassed;
	private String environment;
	private String grade;
	
	//constructor
	public AutonomousCar(int carId,String brand,int noOfTestsConducted,int noOfTestsPassed,String environment)
	{
		this.carId=carId;
		this.brand=brand;
		this.noOfTestsConducted=noOfTestsConducted;
		this.noOfTestsPassed=noOfTestsPassed;
		this.environment=environment;
	}
	
	//getters
	public int getcarId()
	{
		return carId;
		
	}
	public String getbrand()
	{
		return brand;
	}
	public int getnoOfTestsConducted()
	{
		return noOfTestsConducted;
	}
	public int getnoOfTestsPassed()
	{
		return noOfTestsPassed;
	}
	public String getenvironment()
	{
		return environment;
	}
	public String getgrade()
	{
		return grade;
	}
	//setters
	public void setcarId(int carId)
	{
		this.carId=carId;
	}
	public void setgetbrand(String brand)
	{
		this.brand=brand;
	}
	public void setnoOfTestsConducted(int noOfTestsConducted)
	{
		this.noOfTestsConducted=noOfTestsConducted;
	}
	public void setnoOfTestsPassed(int noOfTestsPassed)
	{
		this.noOfTestsPassed=noOfTestsPassed;
	}
	public void setenvironment(String environment)
	{
		this.environment=environment;
	}
	public void setgrade(String grade)
	{
		this.grade=grade;
	}
	
	
	
	

}
