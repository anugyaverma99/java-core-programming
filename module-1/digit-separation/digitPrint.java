//WAJP to print digits of a given number.

import java.util.Scanner;
class digitPrint{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("DIGITS: ");
		while(n!=0){
			int digit=n%10;
			System.out.println(digit);
			n/=10;
		}
	}
}