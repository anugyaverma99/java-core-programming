// WAJP to check whether the given character is a digit, lowercase character, uppercase character or a special character.
// WAJP to check whether the given ccharcter is uppercase vowel or consonant or lowercase vowel or consonant.
// WAJP to check the input number is positive, negative or zero.
// WAJP to print max. and min. number from the three input number.

import java.util.Scanner;
public class typesOfCharacter{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		// char c=sc.next().charAt(0);


		// if(c>='0' && c<='9'){
		// 	System.out.println("the given character is a digit");
		// }
		// else if(c>='a' && c<='z'){
		// 	System.out.println("the given character is a lowercase character");
		// }
		// else if(c>='A' && c<='Z'){
		// 	System.out.println("the given character is a uppercase character");
		// }
		// else{
		// 	System.out.println("the given character is a special character");
		// }


		// if(c>='A' && c<='Z'){
		// 	if(c=='A' || c=='E' || c=='I' || c=='O' || c=='U' ){
		// 		System.out.println("uppercase vowel");
		// 	}
		// 	else{
		// 		System.out.println("uppercase consonant");
		// 	}
		// }
		// else if(c>='a' && c<='z'){
		// 	if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ){
		// 		System.out.println("lowercase vowel");
		// 	}
		// 	else{
		// 		System.out.println("lowercase consonant");
		// 	}
		// }
		// else{
		// 	System.out.println("Invalid character");
		// }

		
		// int n=sc.nextInt();
		// if(n>0){
		// 	System.out.println("positive number");
		// }
		// else if(n<0){
		// 	System.out.println("negative number");
		// }
		// else{
		// 	System.out.println("zero");
		// }


		// int n1=sc.nextInt();
		// int n2=sc.nextInt();
		// int n3=sc.nextInt();
		// if(n1>n2 && n1>n3){
		// 	System.out.println(n1+" is the max. number");
		// }
		// else if(n2>n3 && n2>n1){
		// 	System.out.println(n2+" is the max. number");
		// }
		// else{
		// 	System.out.println(n3+" is the max. number");
		// }


		if(n1<n2 && n1<n3){
			System.out.println(n1+" is the min. number");
		}
		else if(n2<n3 && n2<n1){
			System.out.println(n2+" is the min. number");
		}
		else{
			System.out.println(n3+" is the min. number");
		}

				
			
			
		
	}
}