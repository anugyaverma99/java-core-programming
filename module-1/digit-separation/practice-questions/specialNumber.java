//WAJP to check whether the given number is special number or not.

// SPECIAL NUMBER:
// 19 is a special number
//  digits=1, 9
// sum of digits=10;
// product of digits=1*9=9
// total(10+9)== number

import java.util.Scanner;
class specialNumber{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int product =1;
		int temp=n;
		while(n!=0){
			int digit=n%10;
			sum+=digit;
			product*=digit;
			n/=10;


		}
		int total=sum+product;
		if(total==temp){
			System.out.println(temp+" is a perfect number");
		}
		else{
			System.out.println(temp+" is not  a perfect number" );

		}
	}
}