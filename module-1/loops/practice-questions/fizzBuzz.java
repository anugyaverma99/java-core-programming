/*

 given a number n . for each integer i in the range from 1 to n inclusive, print out value per line
  if i is the multiple of both 3 and 5 print FizzBuzz
  if i is multiple of 3 but not 5 print Fizz
  if i is multiple of 5 but not 3 print Buzz
  if i is not multiple of 3 and 5 both print value of i
 */

import java.util.Scanner;
class fizzBuzz{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
			if(i%3==0 && i%5==0){
				System.out.println("fizzBuzz");
			}
			else if(i%3==0 && i%5!=0){
				System.out.println("Fizz");
			}
			else if(i%3!=0 && i%5==0){
				System.out.println("Buzz");
			}
			else{
				System.out.println(i);
			}
		}

	}
}