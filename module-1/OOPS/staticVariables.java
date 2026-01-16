class staticVariables{
	// class area or global area
	static int a=10;
	// static method
	public static void main(String[] args) {
		// static context
		System.out.println("main start");
		System.out.println(a);
		test();
		System.out.println("main end");
	}
	public static void test(){
		//static context

		System.out.println("test start");
		System.out.println(a);
		int a=25; //local variable
		System.out.println(a);
		System.out.println(staticVariables.a);
		System.out.println("test end");
	}
}