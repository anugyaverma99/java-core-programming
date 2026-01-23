// WAJP to print all palidrome numbers from range 100 to 200
// WAJP to print palindrom numbers from range 100 to 200. 


class palindromeRange{
	public static void main(String[] args) {
		System.out.println("PALINDROME NUMBERS FROM RANGE 100 TO 200");
		for(int i=100;i<200;i++){

			int temp=i;
			int rev=0;
			while(temp!=0){
				int dig=temp%10;
				rev=rev*10+dig;
				temp/=10;

			}
			if(i==rev){
				System.out.println(i);
			}

		}
	}
}