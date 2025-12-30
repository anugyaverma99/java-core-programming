// WAJP to print prime digit of a given number.

import java.util.Scanner;
class primeDigit{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("PRIME DIGITS OF A NUMBER IS: ");
		while(n!=0){
			int digit=n%10;
			int count=0;
			for(int i=1;i<=digit;i++){
				if(digit%i==0){
					count+=1;
				}
			}
			if(count<=2){
				System.out.println(digit);
			}
			n/=10;

		}

	}
}