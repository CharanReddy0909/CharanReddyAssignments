package practicePackage;

public class Institution {
	private int institutionId;
	private String institutionName;
	private String noOfStudentsPlaced;
	private int noOfStudentsCleared;
	private String location;
	private String grade;
	public Institution(int institutionId, String institutionName, String noOfStudentsPlaced, int noOfStudentsCleared,
			String location) {
		
		this.institutionId = institutionId;
		this.institutionName = institutionName;
		this.noOfStudentsPlaced = noOfStudentsPlaced;
		this.noOfStudentsCleared = noOfStudentsCleared;
		this.location = location;
	}
	public int getInstitutionId() {
		return institutionId;
	}
	public void setInstitutionId(int institutionId) {
		this.institutionId = institutionId;
	}
	public String getInstitutionName() {
		return institutionName;
	}
	public void setInstitutionName(String institutionName) {
		this.institutionName = institutionName;
	}
	public String getNoOfStudentsPlaced() {
		return noOfStudentsPlaced;
	}
	public void setNoOfStudentsPlaced(String noOfStudentsPlaced) {
		this.noOfStudentsPlaced = noOfStudentsPlaced;
	}
	public int getNoOfStudentsCleared() {
		return noOfStudentsCleared;
	}
	public void setNoOfStudentsCleared(int noOfStudentsCleared) {
		this.noOfStudentsCleared = noOfStudentsCleared;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	

}
