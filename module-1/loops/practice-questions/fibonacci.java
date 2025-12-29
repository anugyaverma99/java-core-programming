// WAJP to print  fibonacci series till a given number n. 

import java.util.Scanner;
class fibonacci{
	public static void main(String[] args) {
		int n1=0;
		int n2=1;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(n1);
		System.out.println(n2);
		int count=2;
		while(count<n){
			int temp=n1;
			n1=n2;
			n2=temp+n2;
			System.out.println(n2);
			count++;
		
	}


	}
}