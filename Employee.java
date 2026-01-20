import java.util.Scanner;
class Employee
{
	private String employeeName;
	private double employeeSalary;
	public void readEmployeeData(String eName,double eSalary)
	{
		employeeName=eName;
		employeeSalary=eSalary;
	}
	public void displayEmployeeData()
	{
		System.out.println(employeeName);
		System.out.println(employeeSalary);		
	} 
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Employee e1=new Employee();
		System.out.println("Enter Employee Name:"); 
		String eName=sc.nextLine();
		System.out.println("Enter Employee Salary:"); 
		double eSalary=sc.nextDouble();
		e1.readEmployeeData(eName,eSalary);
		e1.displayEmployeeData();
	}
}