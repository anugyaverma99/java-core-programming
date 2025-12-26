//WAP to display whether the given input day is weekend or weekdays as foolowing:
 // Saturday or Sunday: weekend
 // Monday ,Tuesday,Wednesday,Thursday or Friday: weekday
 // else print Invalid input


import java.util.Scanner;
public class daysOfWeek{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String day=sc.next();
		if(day.equals("Saturday") || day.equals("Sunday")){
			System.out.println("Weekend");
		}
		else if(day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday")){
			System.out.println("Weekday");
		}
		else{
			System.out.println("Invalid Input");
		}

	}
}