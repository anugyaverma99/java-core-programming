
class Laptop{
	String brand;
	int ramSize;
	double price;

	Laptop(){
		brand="unknown";
		ramSize=8;
		price=50000.0;
	 }
	 Laptop(String brand){
	 	this();
	 	this.brand=brand;
	 }
	 Laptop(String brand,int ramSize){
	 	this(brand);
	 	this.brand=brand;
	 	this.ramSize=ramSize;
	 }

	 Laptop(String brand,int ramSize,double price){
	 	this(brand,ramSize);
	 	this.brand=brand;
	 	this.ramSize=ramSize;
	 	this.price=price;
	 }
	 public void printDetails(){
	 	System.out.println("brand: "+this.brand);
	 	System.out.println("ram size: "+this.ramSize);
	 	System.out.println("price: "+this.price);
	 }

}

public class constructorChaining2{
	public static void main(String[] args){
		Laptop ref=new Laptop();
		System.out.println("default constructor: ");
		ref.printDetails();

		System.out.println();
		Laptop ref1=new Laptop("dell");
		ref1.printDetails();

		System.out.println();
		Laptop ref2=new Laptop("dell",60);
		ref2.printDetails();

		System.out.println();
		Laptop ref3=new Laptop("dell",60,45000.0);
		ref3.printDetails();

	}
}