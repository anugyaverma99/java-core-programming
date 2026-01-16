// class constructors{
// 	int id;
// 	String name;
// 	double percentage;
// 	String college_name;

// 	public constructors(int id){
// 		this.id=id;
// 	}

// 	public constructors(String name){
// 		this.name=name;
// 	}

// 	public constructors(double percentage){
// 		this.percentage=percentage;
// 	}

// 	public constructors(int id,String name){
// 		this.id=id;
// 		this.name=name;
// 	}

// 	public constructors(int id,double percentage){
// 		this.id=id;
// 		this.percentage=percentage;
// 	}

// 	public constructors(String name, double percentage){
// 		this.name=name;
// 		this.percentage=percentage;
// 	}

// 	public constructors(int id,String name, double percentage){
// 		this.id=id;
// 		this.name=name;
// 		this.percentage=percentage;
// 	}
// 	public constructors(){
// 		this.id=1;
// 		this.name="anugya";
// 		this.percentage=80;
// 		this.college_name="lpu";

// 	}
// 	public static void printDetail(constructors ref){
// 		System.out.println("student id : "+ref.id);
// 		System.out.println("student name : "+ref.name);
// 		System.out.println("student percentage: "+ref.percentage);

// 	}

// 	public static void main(String[] args) {
// 		constructors p=new constructors();
// 		p.printDetail(p);
// 		constructors p1=new constructors(2);
// 		p1.printDetail(p1);
// 		constructors p2=new constructors("shubh");
// 		p2.printDetail(p2);
// 		constructors p3=new constructors("45");
// 		p3.printDetail(p3);
// 		constructors p4=new constructors(3,"kanha");
// 		p4.printDetail(p4);
// 		constructors p5=new constructors("kanha",67);
// 		p5.printDetail(p5);
// 		constructors p6=new constructors(4,"pragya",87);
// 		p6.printDetail(p6);

// 	}
// }

class Address {
    String city;

    // Parameterized constructor
    public Address(String city) {
        this.city = city;
    }

    // Copy constructor (shallow)
    public Address(Address obj) {
        this.city = obj.city;
    }
}

class Employee {
    int id;
    Address address;

    // Parameterized constructor
    public Employee(int id, Address address) {
        this.id = id;
        this.address = address;
    }

    // Copy constructor (shallow copy)
    public Employee(Employee obj) {
        this.id = obj.id;
        this.address = obj.address; // SAME reference
    }
}

public class EmplDetails {
    public static void main(String[] args) {

        Address ad = new Address("Kapurthala");
        Employee emp1 = new Employee(1, ad);

        System.out.println("Emp1 city: " + emp1.address.city);

        Employee emp2 = new Employee(emp1); // shallow copy
        emp2.address.city = "XYZ";

        System.out.println("Emp2 city: " + emp2.address.city);
        System.out.println("Emp1 city after change: " + emp1.address.city);
    }
}
