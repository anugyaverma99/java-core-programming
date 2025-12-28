// WAP to perform arithmetic operation using switch and user choice
// addition:
//  add 2 variable
//  add 3 variable
//  add 4 variable
// subtraction:
//  sub 2 variable
//  sub 3 variable
//  sub 4 variable
// multiplication:
//  mul 2 variable
//  mul 3 variable
//  mul 4 variable
// division:
//  div 2 variable



import java.util.Scanner;
public class arithmeticUsingSwitch{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.print("which arithmetic operation you wanna perform: ");
	String opr=sc.next();
	switch(opr){
	case "addition":
		System.out.print("How many variable do you wanna add? ");
		int n=sc.nextInt();
		int sum=0;
		System.out.println("enter "+n+" variables : ");
		for(int i=0;i<n;i++){
			sum+=sc.nextInt();
		}
		System.out.println("Sum of "+n+" variables is: "+sum);
		break;
	case "subtraction":
		System.out.print("How many variable do you wanna subtract? ");
		int n1=sc.nextInt();
		System.out.println("enter "+n1+" variables : ");
		int sub=sc.nextInt();
		for(int i=0;i<n1-1;i++){
			sub-=sc.nextInt();
		}
		System.out.println("Subtraction of "+n1+" variables is: "+sub);
		break;
	case "multiplication":
		System.out.print("How many variable do you wanna subtract? ");
		int n2=sc.nextInt();
		System.out.println("enter "+n2+" variables : ");
		int mul=1;
		for(int i=0;i<n2;i++){
			mul*=sc.nextInt();
		}
		System.out.println("Multiplication of "+n2+" variables is: "+mul);

		break;
	case "division":
		System.out.println("enter the two variables : ");
		int d1=sc.nextInt();
		int d2=sc.nextInt();
		System.out.println("Division of two variables is: "+(d1/d2));
		break;
	default:
		System.out.println("Invalid operation");
	}
}
}