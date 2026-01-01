// abundant number: sum of its propr factors is greater than number itself.
// proper factors of 
// 12:1,2,3,4,6(factors except itself)

// WAJP to check if given number is abundant number or not. 

import java.util.Scanner;
class abundantNumber{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);{
			int n=sc.nextInt();
			int sum=0;
			for(int i=1;i<n;i++ ){
				if(n%i==0){
					sum+=i;
				}
			}
			if(sum>n){
				System.out.println(n+" is an abundant number");
			}
			else{
				System.out.println(n+" is not an abundant number");
			}
		}
	}
}
