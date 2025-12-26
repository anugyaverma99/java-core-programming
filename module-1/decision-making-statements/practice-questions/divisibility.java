// Q1: WAP to check whether the input number is divisible by 7 or not.

// Q2: WAP to check whether the input number is divisible by both 3 and 5 or either of them else display divisible by none.


import java.util.Scanner;
public class divisibility{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

		//OUTPUT 1: 

		// if(n%7==0){
		// 	System.out.println(n+" is divisible by 7");
		// }
		// else{
		// 	System.out.println(n+" is not divisible by 7");
		// }

		//OUTPUT 2:

		if(n%3==0 && n%5==0){
			System.out.println(n+" is divisible by both 3 and 5");
		}
		else if(n%3==0 && n%5!=0){
			System.out.println(n+" is divisible by  3 but not 5");

		}
		else if(n%3!=0 && n%5==0){
			System.out.println(n+" is divisible by 5 but not 3");

		}
		else{
			System.out.println(n+" is neither divisible by 3 nor 5");
		}
	}
}