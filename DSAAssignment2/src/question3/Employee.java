package question3;

import java.util.Objects;

public class Employee {
int id;
String Name;
double salary;
public Employee(int id, String name, double salary) {
	
	this.id = id;
	Name = name;
	this.salary = salary;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
@Override
public int hashCode() {
	return Objects.hash(Name, id, salary);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	return Objects.equals(Name, other.Name) && id == other.id
			&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
}
@Override
public String toString() {
	return "Employee [id=" + id + ", Name=" + Name + ", salary=" + salary + "]";
}


}
