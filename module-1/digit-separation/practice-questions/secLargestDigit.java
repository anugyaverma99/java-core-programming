// WAJP to find second largest digit from given number.

import java.util.Scanner;
class secLargestDigit{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int l_dig=0;
		int sec_dig=0;
		while(n!=0){
			int digit=n%10;
			if(digit>l_dig){
				sec_dig=l_dig;
				l_dig=digit;
			}
			else if(digit<l_dig && digit>sec_dig){
				sec_dig=digit;
			}
			
			n/=10;
		}
		System.out.println(sec_dig);

	}
}
