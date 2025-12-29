// wajp to swap using third variable and without using third variable
class swapping{
	public static void main(String[] args) {
		int a=10;
		int b=20;

		// WITHOUT USING THIRD VARIABLE. 

		// System.out.println("value of a before swapping: "+a);
		// System.out.println("value of b after swapping: "+b);
		// b=a+b;
		// a=b-a;
		// b=b-a;
		// System.out.println("value of a after swapping: "+a);
		// System.out.println("value of b after swapping: "+b);

		// WITH USING THIRD VARIABLE

		int temp=a;
		a=b;
		b=temp;
		System.out.println("value of a after swapping: "+a);
		System.out.println("value of b after swapping: "+b);



	}
}