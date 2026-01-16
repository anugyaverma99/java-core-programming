class DemoClass{
	static{
		System.out.println("static block-1");
	}
	static {
		System.out.println("static block-2");
	}
	{
		System.out.println("non static block-1");
	}
	void displayMessage(){
		System.out.println("non static method");
	}
	static void staticMethodOne(){
		System.out.println("static method-1");
	}
	static void staticMethodTwo(){
		System.out.println("static method-2");
	}
	public static void main(String[] args) {
		DemoClass.staticMethodOne();
		DemoClass.staticMethodTwo();
		DemoClass obj=new DemoClass();
		obj.displayMessage();
	}

}