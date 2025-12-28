// WAJP to display grade obtained by student based on user input.
// >90 =A
// >=75 AND <90 =B
// >=60 AND <75 =C
// >=40 AND <60 =D
// <40= Fail.

import java.util.Scanner;
 

public class gradeObtained{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int marks=sc.nextInt();
		if(marks>=90){
			System.out.println("GRADE A");
		}
		else if(marks>=75 && marks<90){
			System.out.println("GRADE B");
		}
		else if(marks>=60 && marks<75){
			System.out.println("GRADE C");
		}
		else if(marks>=40 && marks<60){
			System.out.println("GRADE D");
		}
		else if(marks<40){
			System.out.println("Fail");
		}
		else{
			System.out.println("Invalid marks");
		}

	}
}