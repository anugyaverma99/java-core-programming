class Father{
	int a=10;
}
class Son extends Father{
	int b=20;
}
class nonPrimitiveConversion{
	public static void main(String[] args) {
		System.out.println("Main start");
		System.out.println("Object of father class store inside father class ref variable");
		Father ref1=new Father();
		System.out.println(ref1.a);
		// System.out.println(ref1.b); CTE CANNOT FIND SYMBOL

		System.out.println("Object of son class stored inside son class ref variable");

		Son ref2=new Son();
		System.out.println(ref2.a);
		System.out.println(ref2.b);
		System.out.println("---UPCASTING-----");
		Father f=new Son();

		System.out.println(f.a);
		// System.out.println(f.b); CTE CANNOT FIND SYMBOL

		System.out.println("---DOWNCASTING---");
		Son s=(Son)f;

		System.out.println(s.a);
		System.out.println(s.b);
		System.out.println("Main End");
		
	}

}