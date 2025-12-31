// WAJP to find second smallest digit from given number.

import java.util.Scanner;
class secSmallestDigit{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int s_dig=n%10;
		int sec_dig=n%10;
		while(n!=0){
			int digit=n%10;
			if(digit<s_dig){
				sec_dig=s_dig;
				s_dig=digit;
			}
			else if(digit>s_dig && digit<sec_dig){
				sec_dig=digit;
			}
			
			n/=10;
		}
		System.out.println(sec_dig);
}
}


