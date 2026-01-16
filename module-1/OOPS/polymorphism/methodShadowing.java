class Father{
	public static void test(){
		System.out.println("Father class test method");
	}
	public static void demo(int a){
		System.out.println("Father class demo method");
	}
}
class Son extends Father{
	//@Override
	public static void test(){
		System.out.println("son class test method");
	}
	public static void demo(int a){
		System.out.println("son class demo method");
	}
}
class methodShadowing{
	public static void main(String[] args) {
		System.out.println("Main start");
		System.out.println("-- Father object stored in father ref variable--");
		Father ref1=new Father();
		ref1.test();
		ref1.demo();
		System.out.println("\n-- Son object stored in son ref variable");
		Son ref2=new Son();
		ref2.test();
		ref2.demo();
		System.out.println("UPCASTING");
		Father ref3=new Son();
		ref3.test();
		ref3.demo();		
		System.out.println("Downcasting");
		Son ref4=(Son)ref3;


































































































		ref4.test();
		ref4.demo();
		System.out.println("main end");
	}

}