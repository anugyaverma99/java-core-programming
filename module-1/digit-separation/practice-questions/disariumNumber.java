// DISARIUM NUMBER- when sum of its digit raised to the power of their respective position is equal to number itself. 
// eg. 175 // 1^1+7^2+5^3=175

// WAJP to check if given number is a disarium number or not.

import java.util.*;
class disariumNumber{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		int temp=n;
		while(n!=0){
			count+=1;
			n/=10;

		}
		
		double sum=0;
		int temp1=temp;
		while(temp!=0){
			double dig=temp%10;
			double s=Math.pow(dig,count);
			sum+=s;
			count--;
			temp/=10;

		}
		if(temp1==sum){
			System.out.println("yes");
		}
		else{
			System.out.println("no");
		}
		
	}
}