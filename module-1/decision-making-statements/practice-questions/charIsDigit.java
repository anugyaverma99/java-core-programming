//WAP to check whether the input character is a digit or not.

import java.util.Scanner;
public class charIsDigit{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		char c=sc.next().charAt(0);
		if(c>='0' && c<='9'){
			System.out.println("the given charcter is digit");
		}
		else{
			System.out.println("the given character is not a digit");
		}

	}
}