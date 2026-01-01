// WAJP to check whether the given number is a xylem number or phloem number.
// maintain sum of extreme digits(first and last digit )
// and sum of all inner digits
// if both are equal then it is a xylem number else it is a phloem number.

import java.util.Scanner;
class xylemPhloemNumber{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n;
		int sum_ext=0;
		int sum_inner=0;
		while(n!=0){
			int dig=n%10;
			if(n<10 || n==temp){
				sum_ext+=dig;
			}
			else{
				sum_inner+=dig;
			}
			n/=10;
		}
		if(sum_ext==sum_inner){
			System.out.println("1");
		}
		else{
			System.out.println("0");
		}
	}
}