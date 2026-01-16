class Father{
	static int a=10;
	public  static void test(){
		System.out.println("Father class static method");
	}
	static{
		System.out.println("SIB Father class");
	}

}
class Son extends Father{
	static int b=20;
	public static void demo(){
		System.out.println("son class static method");
	}
	static{
		System.out.println("SIB son class");
	}
}
class example{
	static{
		System.out.println("SIB Driver class");

	}
	public static void main(String[] args) {

		// System.out.println("main start");
		// System.out.println(Son.a);
		// System.out.println(Son.b);
		// Son.demo();
		// System.out.println(Father.a);
		// Father.test();

		// OUTPUT:
		// SIB Driver class
		// main start
		// SIB Father class
		// 10
		// SIB son class
		// 20
		// son class static method
		// 10
		// Father class static method


	}

}