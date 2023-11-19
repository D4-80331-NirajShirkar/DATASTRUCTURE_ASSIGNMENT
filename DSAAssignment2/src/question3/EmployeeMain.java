package question3;

public class EmployeeMain {
	public static void insertionsort(Employee[] employees)
	{
		int N = employees.length;
		for(int i = 1; i< N;i++)
		{
			Employee temp = employees[i];
			int j;
			for(j=i-1;j>=0&&employees[j].getSalary()>temp.getSalary();j--)
			{
				employees[j+1]=employees[j];
				
			}
			employees[j+1]=temp;
		}
	}
	
public static void main(String[] args)
{
	Employee[] employees = new Employee[3];
	employees[0] = new Employee(1,"Niraj",200000.0);
	employees[1] = new Employee(2,"Atharva",100070.0);
	employees[2] = new Employee(3,"Obc",10000.0);
	
	for(Employee e:employees)
	{
		System.out.println(e.getId()+":"+e.getName()+":"+e.getSalary());
	}
	insertionsort(employees);
	for(Employee e:employees)
	{
		System.out.println(e.getId()+":"+e.getName()+":"+e.getSalary());
	}
}
}
