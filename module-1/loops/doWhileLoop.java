/*
WAP to print numbers from range 
-111 to -101
123 to 113
5 to-5
-10 to 0

WAP to print characters from range 
s to l
T to Z
*/

class doWhileLoop{
	public static void main(String[] args){
		int a=-111;
		do{
			System.out.println(a++);
		}
		while(a<=-101);

		System.out.println();
		int b=123;
		do{
			System.out.println(b--);
		}
		while(b>=113);

        System.out.println();
		int c=5;
		do{
			System.out.println(c--);
		}
		while(c>=-5);

		System.out.println();
		int d=-10;
		do{
			System.out.println(d++);
		}
		while(d<=0);

		System.out.println();
		char e='s';
		do{
			System.out.println(e--);
		}
		while(e>='l');

		System.out.println();
		char f='T';
		do{
			System.out.println(f++);
		}
		while(f<='Z');

	}
}