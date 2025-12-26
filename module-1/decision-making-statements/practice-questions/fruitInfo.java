//WAP using switch-case to display the information of fruit as following:
// apple: Apples are rich in fiber and vitamin C.
// banana: Bananas are a great source of potassium
// mango: Mangoes are the king of fruits.
// orange: Oranges are packed with vitamin C.
// other: Sorry, I don't have any information about that fruit


import java.util.Scanner;
public class fruitInfo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String fruit=sc.next();
		switch(fruit){
		case "apple":
			System.out.println("Apples are rich in fiber and vitamin C.");
			break;
		case "banana":
			System.out.println("Bananas are a great source of potassium");
			break;
		case "mango":
			System.out.println("Mangoes are the king of fruits.");
			break;
		case "orange":
			System.out.println("Oranges are packed with vitamin C.");
			break;
		default:
			System.out.println("Sorry, I don't have any information about that fruit");
		}

	}
}