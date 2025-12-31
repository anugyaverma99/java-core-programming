//WAJP to print  factorial of each digit of a number separately .
// 342
// 2!=2
// 4!=24
// 3!=6

import java.util.Scanner;
class factorialDigits{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n!=0){
			int dig=n%10;
			int fact=1;
			for(int i=1;i<=dig;i++){
				fact*=i;
			}
			System.out.println("factorial of "+dig+" is: "+fact);
			n/=10;
		}
	}
}