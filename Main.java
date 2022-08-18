package learnCode;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Main{


	public static void main(String args[]) throws SQLException {
//		
		Scanner sc=new Scanner(System.in);
		Scanner sc2=new Scanner(System.in);
		
		boolean flag=true;
		
		while(flag==true) {
		
			System.out.println("");
		System.out.println("1 retrive");
		System.out.println("2 retrive all");
		System.out.println("3 insert");
		System.out.println("4 update");
		System.out.println("5 delete");
		System.out.println("6 exist");
		
		int SWITCH = sc.nextInt();
		
		switch(SWITCH) {
			case 1:
			System.out.println("Enter Id");	
				int ID=sc2.nextInt();
			 EmployeeDAO employeeDAO = new EmployeeDAOImpl();
			 Employee employee = employeeDAO.get(ID);
			 System.out.println(employee);
			 
			 break;
				
			case 2:
				
				List<Employee> employees;
				EmployeeDAO employeeDAO2 = new EmployeeDAOImpl(); 
				employees = employeeDAO2.getAll();
				for(Employee employee2 : employees) {
					System.out.println(employee2);
				}
			 break;
				
			case 3:
				System.out.println("Enter id");
				int ID2=sc2.nextInt();
				System.out.println("Enter employee id");
				int E_ID2=sc2.nextInt();
				System.out.println("Enter first name");
				String FN2=sc2.next();
				System.out.println("Enter last name");
				String LN2=sc2.next();
				System.out.println("Enter dept no.");
				String D2=sc2.next();
				
				EmployeeDAO employeeDAO3 = new EmployeeDAOImpl(); 
				Employee employee2 = new Employee(ID2, E_ID2, FN2, LN2, D2);
				int result = employeeDAO3.insert(employee2);
				System.out.println(result);
				
				break;
				
			case 4:
				System.out.println("Enter id");
				int ID3=sc2.nextInt();
				System.out.println("Enter employee id");
				int E_ID3=sc2.nextInt();
				System.out.println("Enter first name");
				String FN3=sc2.next();
				System.out.println("Enter last name");
				String LN3=sc2.next();
				System.out.println("Enter dept no.");
				String D3=sc2.next();
				
				EmployeeDAO employeeDAO4 = new EmployeeDAOImpl(); 
				Employee employee3 = new Employee(ID3, E_ID3, FN3, LN3, D3);
				employeeDAO4.update(employee3);
				System.out.println(employee3);
				
				break;
				
			case 5:
				System.out.println("Enter id");
				int ID4=sc2.nextInt();
				
				EmployeeDAO employeeDAO5 = new EmployeeDAOImpl(); 
				Employee employee4 = employeeDAO5.get(ID4);
				
				System.out.println(employee4);
				
				int result2 = employeeDAO5.delete(employee4);
				System.out.println(result2);
				
				break;
				
			case 6:
				flag=false;
				break;
			
		}
		
		}
	}
}
