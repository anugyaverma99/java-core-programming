class Address{
	String city;
	String state;
	public Address(String city,String state){
		this.city=city;
		this.state=state;
	}

}

class Student{
	int id;
	String name;
	double marks;
	Address address;
	public Student(int id,String name,double marks, Address address){
		this.id=id;
		this.name=name;
		this.marks=marks;
		this.address=address;
	}
}

public class weakHasA{
	public static void main(String[] args) {
		Address a=new Address("Jalandhar","Punjab");
		System.out.println("Address Class");
		System.out.println("City: "+a.city);
		System.out.println("State: "+a.state);
		Student s1=new Student(1,"Anugya",89.5,a);
		System.out.println("Student data: ");
		System.out.println("Student id: "+s1.id);
		System.out.println("Student name: "+s1.name);
		System.out.println("Student marks: "+s1.marks);
		System.out.println("Student address");
		System.out.println("city: "+s1.address.city);
		System.out.println("state: "+s1.address.state);

	}
}