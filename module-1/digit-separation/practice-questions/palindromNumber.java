//WAJP to check the given number is palindrom or not.

import java.util.Scanner;
class palinromNumber{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n;
		int rev=0;
		while(temp!=0){
			int dig=temp%10;
			rev=rev*10+dig;
			temp/=10;

		}
		if(rev==n){
			System.out.println(n+" is a palindrom number");
		}
		else{
			System.out.println(n+" is not a palindrom number");
		}
	}
}