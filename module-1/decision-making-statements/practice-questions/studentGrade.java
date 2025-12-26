//WAP to take student's grade as input and display the corresponding message:
// A: Excellent
// B: Good
// C:Fair
// D:pass
// E:fail
// others:invalid input


import java.util.Scanner;
class studentGrade{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		char c=sc.next().charAt(0);
		switch(c){
		case 'A':
			System.out.println("Excellent");
			break;
		case 'B':
			System.out.println("Good");
			break;
		case 'C':
			System.out.println("Fair");
			break;
		case 'D':
			System.out.println("pass");
			break;
		case 'E':
			System.out.println("fail");
			break;
		default:
			System.out.println("invalid input");
		}
	}
}