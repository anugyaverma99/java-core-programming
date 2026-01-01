/*
NIVEN NUMBER:
24 is a niven number
sum of digits=6
24%6==0 true
else false

*/
// WAJP to check whether the given number is a niven number or not.

import java.util.Scanner;
class nivenNumber{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int temp=n;
		while(n!=0){
			int digit=n%10;
			sum+=digit;
			n/=10;
		}
		if(temp%sum==0){
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}
	}
}