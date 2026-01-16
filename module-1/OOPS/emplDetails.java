class Address{
	String city;
 public Address(String city){
 	this.city=city;
 }
 public Address(Address obj){
 	this.city=obj.city;
 }
}
class Employee{
	int id;
	Address address;
	public Employee(){
		this.id=id;
		this.address=address;		

	}
	public Employee(Employee obj2){
		this.id=obj2.id;
		this.city=obj2.city;
	}


}
public class emplDetails{
	Address ad=new Address("abd");
	Employee emp1=new Employee(1,"kapurthala");
	System.out.println("id: "+emp1.id);
	System.out.println("city: "+emp1.city);
	System.out.println("address: "+emp1.address.city);
	Employee emp2=new Employee(emp1);
	emp2.address.city="xyzz";
	System.out.println("modified address: "+emp2.address.city);

  
}