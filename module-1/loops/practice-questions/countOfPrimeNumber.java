// WAJP to print count of prime numbers from 1 to n using user input. 

import java.util.Scanner;
class countOfPrimeNumber{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int primeNumbers=0;
		for(int i=1;i<=n;i++){
			int count=0;
			for(int j=1;j<=i;j++){
				if(i%j==0){
					count+=1;
				}
			}
			if(count<=2){
				primeNumbers+=1;

			}
		}
		System.out.println("total prime numbers from 1 to n are: "+primeNumbers);
	}
}