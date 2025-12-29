/*
perfect number - sum of factors except itself is the original number

WAJP to print perfect numbers from 1 to n;
*/

import java.util.Scanner;
class perfectNumber{
	 public static void main(String[] args) {
	 	Scanner sc=new Scanner(System.in);
	 	int n=sc.nextInt();
	 	int sum=0;
	 	for(int i=1;i<n;i++){
	 		if(n%i==0){
	 			sum+=i;

	 		}
	 	}
	 	if(sum==n){
	 		System.out.println("perfect number");
	 	}
	 	else{
	 		System.out.println("not a perfect number");
	 	}
		
	}
}