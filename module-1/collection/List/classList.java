import java.util.*;
class Employee{
	int employeeId;
	String name;
	double salary;
	Employee(int id,String name,double salary){
		this.employeeId=id;
		this.name=name;
		this.salary=salary;
	}
	static Employee newObject(int id,String name,double salary){
		return new Employee(id,name,salary);
	}
	public void displayEmpDetails(){
		System.out.println("Employee id: "+employeeId);
		System.out.println("employee name: "+name);
		System.out.println("employee salary: "+salary);
	}

}
class Company{
	List empdetails=new ArrayList();
	public void maintainlist(Employee e){
		empdetails.add(e);
	}
	public void display(){
		for(Object e:empdetails){
		e.displayEmpDetails();
	}
	}

}
public class classList{
	public static void main(String[] args) {
		Employee e1=Employee.newObject(1,"neha",50000);
		e1.displayEmpDetails();
		Employee e2=Employee.newObject(2,"kusuma",34567);
		e2.displayEmpDetails();
		Company c=new Company();
		c.maintainlist(e1);
		c.maintainlist(e2);
		c.display();

	}

}