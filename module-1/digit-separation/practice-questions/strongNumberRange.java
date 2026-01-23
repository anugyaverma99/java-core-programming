// WAJP to print strong numbers from range 1 to 1000.

lass strongNumberRange{
	public static void main(String[] args) {
		System.out.println("STRONG NUMBER FROM 1 TO 1000: ");
		for(int i=1;i<=1000;i++){
			int temp=i;
			int sum=0;
			while(temp!=0){
				int dig=temp%10;
				int fact=1;
				for(int j=1;j<=dig;j++){
					fact*=j;

				}
				sum+=fact;
				if(sum==i){
					System.out.println(i);
				}

				temp/=10;
			}
		}
	}
}