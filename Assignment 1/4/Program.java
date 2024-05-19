

import java.util.Scanner;

public class Program {
	
	public static int empidSearch(Employee arr[], int N, int empid) {
		for(int i=0; i< N; i++) {
			if(arr[i].empid == empid)
				return i;
		}
		return -1;
	}
	
	public static int salarySearch(Employee arr[], int N, double salary) {
		for(int i=0; i< N; i++) {
			if(arr[i].salary == salary)
				return i;
		}
		return -1;
	}
	
	public static int nameSearch(Employee arr[], int N, String name) {
		for(int i=0; i< N; i++) {
			if((arr[i].name).equals(name))
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		
		Employee arr[] = {new Employee(1,"Anil",20000.0), new Employee(2,"Kriti",25000.00),new Employee(3,"Sumit",40000.00)};
		int choice,result,key;
		String name;
		double salary;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("0. TO Exit");
			System.out.println("1. To Search by Empid");
			System.out.println("2. To Search by Name");
			System.out.println("3. To Search by Salary");
			System.out.println("Enter Choice: ");
			choice  = sc.nextInt();
			
		switch (choice) {
		case 0:
			System.out.println("Thank you");
			result=-2;
			break;
		case 1:
			System.out.println("Enter Empid to Search: ");
			key = sc.nextInt();
			result = empidSearch(arr, arr.length, key);
			break;
		case 2:
			System.out.println("Enter Name to Search: ");
			name = sc.next();
			result = nameSearch(arr, arr.length, name);
			break;
		case 3:
			System.out.println("Enter Salary to Search: ");
			salary = sc.nextDouble();
			result = salarySearch(arr, arr.length, salary);
			break;

		default:
			System.out.println("Invalid Choice");
			result = -2;
			break;
		}
		
		if(result== -1)
			System.out.println("Not Found");
		else if(result == -2)
			System.out.println("");
		else
			System.out.println(arr[result]+" at Index: "+result);
			
		}while(choice != 0);
		sc.close();
	}

}

class Employee{
	int empid;
	String name;
	double salary;
	
	public Employee() {}
	
	public Employee(int empid, String name, double salary) {
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}
	
}