// WAJP to print print product of all numbers from 1 to 10.

class productOfRange{
	public static void main(String[] args){
		int product=1;
		for(int i=1;i<=10;i++){
			product*=i;
		}
		System.out.println(product);
	}
}