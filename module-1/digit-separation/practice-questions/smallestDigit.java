// WAJP to find smallest digit from given number.

import java.util.Scanner;
class smallestDigit{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int s_dig=n%10;
		while(n!=0){
			int dig=n%10;
			if(dig<s_dig){
				s_dig=dig;
			}
			n/=10;
		}

		System.out.println(s_dig);
	}
}