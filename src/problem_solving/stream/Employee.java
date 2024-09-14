package problem_solving.stream;

public class Employee {
	
	private String firstName;
	private String lastName;
	private String department;
	private Integer yearOfExpericance;
	private Double salary;
	
	public Employee(){}
	
	public Employee(String firstName,String lastName,String department,Integer yearOfExpericance,Double salary){
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.yearOfExpericance = yearOfExpericance;
		this.salary = salary;		
	}
	
	public String getFirstName() {return firstName;}

	public void setFirstName(String firstName) {this.firstName = firstName;}

	public String getLastName() {return lastName;}

	public void setLastName(String lastName) {this.lastName = lastName;}

	public String getDepartment() {return department;}

	public void setDepartment(String department) {this.department = department;}

	public Integer getYearOfExpericance() {return yearOfExpericance;}

	public void setYearOfExpericance(Integer yearOfExpericance) {this.yearOfExpericance = yearOfExpericance;}

	public Double getSalary() {return salary;}

	public void setSalary(Double salary) {this.salary = salary;}

}
