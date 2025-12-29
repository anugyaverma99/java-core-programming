/*
 WAJP to check whether the given number is prime number or not;
*/

import java.util.Scanner;
class primeNumber{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		for(int i=1;i<=n;i++){
			if(n%i==0){
				count+=1;
			}
		}
		if(count>2){
			System.out.println(n+" is not a prime number");
		}
		else{
			System.out.println(n+" is a prime number");
		}
	}
}
