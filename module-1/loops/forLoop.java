/*
 WAJP to print numbers from range:
 1111 to 1121
  1234 to 1223
  -1111 to -1121
  -1234 to -1223

  WAJP to print characters from range:
  d to j
  m to e
  z to t
  r to x

  using for loop.
*/

class forLoop{
	public static void main(String[] args){
		
		for(int a=1111;a<=1121;a++){
			System.out.println(a);
		}

		System.out.println();
		for(int b=1234;b>=1223;b--){
			System.out.println(b);
		}

		System.out.println();
		for(int c=-1111;c>=-1121;c--){
			System.out.println(c);
		}

		System.out.println();
		for(int d=-1234;d<=-1223;d++){
			System.out.println(d);
		}

		System.out.println();
		for(char e='d';e<='j';e++){
			System.out.println(e);
		}

		System.out.println();
		for(char f='m';f>='e';f--){
			System.out.println(f);
		}

		System.out.println();
		for(char g='z';g>='t';g--){
			System.out.println(g);
		}

		System.out.println();
		for(char h='r';h<='x';h++){
			System.out.println(h);
		}

	}
}