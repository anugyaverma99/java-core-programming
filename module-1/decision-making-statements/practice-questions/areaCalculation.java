//WAJP to calculate area of different shapes according to user input using switch-case statement.
// shapes-circle, rectangle, triangle and square.

import java.util.Scanner;
public class areaCalculation{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String shape=sc.next();
		switch(shape){
		case "circle":
			System.out.print("Enter the radius of the circle: ");
			double rd=sc.nextDouble();
			double area_cir=3.14*rd*rd;
			System.out.println("The area of circle is: "+area_cir);
			break;

		case "rectangle":
			System.out.print("Enter the length of rectangle: ");
			double l=sc.nextDouble();
			System.out.print("Enter the breadth of rectangle: ");
			double b=sc.nextDouble();
			double area_rec=l*b;
			System.out.println("The area of rectangle is: "+area_rec);
			break;

		case "triangle":
			System.out.print("Enter the base of rectangle: ");
			double base=sc.nextDouble();
			System.out.print("Enter the height of rectangle: ");
			double h=sc.nextDouble();

			double area_tri=0.5*base*h;
			System.out.println("The area of triangle is: "+area_tri);
			break;
		case "square":
			System.out.print("Enter the side of square: ");
			double s=sc.nextDouble();
			

			double area_sq=s*s;
			System.out.println("The area of circle is: "+area_sq);
			break;
		default:
			System.out.println("invalid shape entered");

		}
	}
} 