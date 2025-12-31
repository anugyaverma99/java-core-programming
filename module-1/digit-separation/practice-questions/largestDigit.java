// WAJP to find largest digit from given number.

import java.util.Scanner;
class largestDigit{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int l_dig=n%10;
		while(n!=0){
			int dig=n%10;
			if(dig>l_dig){
				l_dig=dig;
			}
			n/=10;
		}

		System.out.println(l_dig);
	}
}