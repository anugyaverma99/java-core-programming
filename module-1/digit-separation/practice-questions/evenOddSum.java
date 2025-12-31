// WAJP to sum even and odd digits of a number separately and then multiply both results to return the total.

import java.util.Scanner;
class evenOddSum{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int even_sum=0;
		int odd_sum=0;
		while(n!=0){
			int digit=n%10;
			if(digit%2==0){
				even_sum+=digit;
			}
			else{
				odd_sum+=digit;
			}
			n/=10;

		}
		System.out.println(even_sum*odd_sum);
	}
}