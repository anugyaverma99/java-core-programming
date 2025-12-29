/*
WAJP to check whether the given character is 
uppercase vowel -- print numbers from range 10 to 20 using do-while loop
uppercase consonant -- print numbers from range 25 to 15 using for loop
lowercase consonant -- print numbers from range -25 to -15 using for loop
lowercase vowel -- print numbers from range -10 to -20 using while loop
*/

import java.util.*;
class conditionBasedLoop{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		char c=sc.next().charAt(0);
		if(c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){
			int a=10;
			do{
				System.out.println(a++);
			}
			while(a<=20);


		}
		else if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
			int b=-10;
			while(b>=-20){
				System.out.println(b--);
			}

		}
		else if(Character.isUpperCase(c)){
			for(int i=25;i>=15;i--){
				System.out.println(i);
			}

		}
		else if(Character.isLowerCase(c)){
			for(int d=-25;d<=-15;d++){
				System.out.println(d);
			}
		}
		else{
			System.out.println("INVALID CHARACTER");
		}
	}
}