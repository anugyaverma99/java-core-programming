class methodOverriding2{
	public static void main(String[] args) {
		Circle s=new Circle();
		s.calculateArea();		
	}

}

class Shape{
	public void calculateArea(){
		System.out.println("super class");
	}
}

class Circle extends Shape{
	int radius=5;
	public void calculateArea(){
		double area=3.14*radius*radius;
		System.out.println("Area of circle is: "+area);
	}
}
class Rectangle extends Shape{
	int length=2;
	int breadth=3;
	public void calculateArea(){
		double area=length*breadth;
		System.out.println("Area of Rectangle is: "+area);
	}
}