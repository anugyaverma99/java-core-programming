abstract class Father{
	// ABSTRACT METHODS
	abstract public void test();
	abstract public int add(int a,int b);

}
class Son extends Father{
	
	@Override
	public void test(){
		System.out.println("test method override");
	}

	
	public int add(int a,int b){
		return a+b;
	}
	public void demo(){
		System.out.println("son class demo method ");
	}
}
class abstraction{

	public static void main(String[] args) {
		System.out.println("main start");
		// Father ref=new Father(); ERROR: CTE WE CANNOT INSTANTIATE THE TYPE FATHER

		//UPCASTING

		Father ref=new Son();
		ref.test();
		System.out.println(ref.add(10,20));
		// ref.demo(); ERROR: CTE
 
		//DOWNCASTING

		Son obj=(Son)ref;
		obj.demo();
		System.out.println("main end");

	}

}