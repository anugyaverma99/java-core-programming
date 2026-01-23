//WAJP to check whether the given number is strong number or not.

// strong number: sum of factorial of ech digit is equal to given number.

// ex.==145

import java.util.Scanner;
class strongNumber{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n;
		int sum=0;
		while(temp!=0){
			int dig=temp%10;
			int fact=1;
			for(int i=1;i<=dig;i++){
				fact*=i;

			}
			sum+=fact;
			temp/=10;
		}
		if(sum==n){
			System.out.println(n+" is a strong number");
		}
		else{
			System.out.println(n+" is not  a strong number");
		}
	}
}