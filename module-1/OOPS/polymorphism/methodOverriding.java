public class methodOverriding{
	public static void main(String[] args) {
		
			Vehicle v=new Car();
			v.speedUp();
			Vehicle v1=new Bicycle();
			v1.speedUp();
		
	}

}
class Vehicle{
	static int s=0;
	public static void speedUp(){
		s+=10;
		System.out.println("Speeding up to: "+s+" km/hr");
	}
}
class Car extends Vehicle{
	

	public static void speedUp(){
		s+=40;
		System.out.println("Speeding up to: "+s+" km/hr");
	}

}
class Bicycle extends Vehicle{
	
	public static void speedUp(){
		s+=5;
		System.out.println("Speeding up to: "+s+" km/hr");
	}

}