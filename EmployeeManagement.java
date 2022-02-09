package com.capgemini.day4;
import java.util.Scanner;
class Employee{
	
	
	private String name;
	private int id;
	private int salary;
	
	Employee()
	{
		
	}
	
	public Employee(String name, int id, int salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public int getSalary() {
			return salary;
		}

		public void setSalary(int salary) {
			this.salary = salary;
		}
		
		public void toPrint() {
			System.out.println("Employee - Name = "+ this.name +" , id = "+this.id+" , salary = "+this.salary);
		}

		
}
public class EmployeeManagement {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 1 if you need some details");
		int z = s.nextInt();
		if(z==1)
		{
			Employee[] e = {};
			System.out.println("Enter 1 for create a List of employee");
			System.out.println("Enter 2 for Display a List of employee");
			System.out.println("Enter 3 for search employee");
			System.out.println("Enter 4 for delete a employee");
			System.out.println("Enter 6 Sort the Employee ASC BY Name");
			System.out.println("Enter 7 Sort the Employee DSC By Name");
			System.out.println("Enter 8 Sort the Employee ASC BY Salary");
			System.out.println("Enter 9 Sort the Employee DSC By Salary");
			System.out.println("Enter 10 Minimun paid salary employee");
			System.out.println("Enter 11 maximum salry of employee");
			System.out.println("Enter 12 Avg of employee Salary");
			System.out.println("Enter 13 Sum of employee Salary");
			
			System.out.println("enter 5 for exit");
			int option = s.nextInt();
			
			if(option==1)
			{
				System.out.println("Enter the no of employees");
				int n = s.nextInt();
				for(int i=0;i<n;i++)
				{
					System.out.println("Enter the name");
					String name = s.next();
					e[i].setName(name);
					System.out.println("Enter id");
					int id = s.nextInt();
					e[i].setId(id);
					System.out.println("Enter salary");
				    int salary = s.nextInt();
					e[i].setSalary(salary);
				}
			}
			if(option==2)
			{
				for(int i=0;i<e.length;i++)
				{
					e[i].toPrint();
				}
			}
			if(option==3)
			{
				System.out.println("Enter the ID of the employee you want to know");
				int id = s.nextInt();int flag =0;
				for(int i=0;i<e.length;i++)
				{
					if(id==e[i].getId())
					{
						flag=1;
						e[i].toPrint();
					}
				}
				if(flag==0)
				{
					System.out.println("There is no such employee");
				}
			}
			if(option==4)
			{
				System.out.println("Enter the name of the employee to be deleted");
				String name = s.next();
				int flag = 0;
				for(int i=0;i<e.length;i++)
				{
					if(e[i].getName()==name)
					{
						flag=1;
						e[i].setName(null);
						e[i].setId(Integer.MIN_VALUE);
						e[i].setSalary(Integer.MIN_VALUE);
					}
				}
				if(flag==0)
				{
					System.out.println("There is no such employee");
				}
			}
			if(option==10)
			{
				int min = Integer.MAX_VALUE;
				int index=Integer.MIN_VALUE;
				for(int i=0;i<e.length;i++)
				{
					if(min>e[i].getSalary())
					{
						min = e[i].getSalary();
						index =i;
					}
				}
				e[index].toPrint();
			}
			if(option==11)
			{
				int max = Integer.MIN_VALUE;
				int index=Integer.MIN_VALUE;
				for(int i=0;i<e.length;i++)
				{
					if(max<e[i].getSalary())
					{
						max = e[i].getSalary();
						index =i;
					}
				}
				e[index].toPrint();
			}
			if(option==12)
			{
				int sum=Integer.MIN_VALUE;
				for(int i=0;i<e.length;i++)
				{
					sum = sum +e[i].getSalary();
				}
				int avg = sum /e.length;
				System.out.println(avg);
			}
			if(option==13)
			{
				int sum=Integer.MIN_VALUE;
				for(int i=0;i<e.length;i++)
				{
					sum = sum +e[i].getSalary();
				}
				System.out.println(sum);
			}
	}

}
}
