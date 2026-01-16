class Circle{
	private double radius;
	public void setRadius(double radius){
		this.radius=radius;
	}
	public double getRadius(){
		return radius;
	}
	public double calculateArea(){
		return 3.14*radius*radius;
	}
	public double calculatePerimeter(){
		return 2*3.14*radius;
	}


}
public class getterSetter3{
	public static void main(String[] args) {
		Circle c=new Circle();
	c.setRadius(3.0);
	System.out.println("Area: "+c.calculateArea());
	System.out.println("Perimeter: "+c.calculatePerimeter());

		
	}

}