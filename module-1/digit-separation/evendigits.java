// WAJP to print even digits of a given number.

import java.util.Scanner;
class evendigits{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("EVEN DIGITS OF A NUMBER IS: ");
		while(n!=0){
			int digit=n%10;
			if(digit%2==0){
				System.out.println(digit);
			}
			n/=10;
		}

	}
}