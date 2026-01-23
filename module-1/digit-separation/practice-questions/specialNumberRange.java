//WAJP to print special numbers from the range 1 to 100.

class specialNumberRange{
	public static void main(String[] args) {
		int temp=0;
		System.out.println("TOTAL SPECIAL NUMBER FROM 1 TO 100: ");

		for(int i=1;i<=100;i++ ){
			int sum=0;
		int pro=1;
			temp=i;
			while(temp!=0){
				int digit=temp%10;
				sum+=digit;
				pro*=digit;
				temp/=10;

			}
			int total=sum+pro;
			if(total==i){
				System.out.println(i);
			}
		}
	}
}