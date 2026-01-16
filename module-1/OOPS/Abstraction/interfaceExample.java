interface Father{
	abstract public void test();
	abstract public int add(int a,int b);
}
class Son implements Father{
	@Override
	public void test(){
		System.out.println("Abstract method override");
	}
	@Override
	public int add(int a,int b){
		return a+b;
	}
}
class interfaceExample{
	public static void main(String[] args) {
		
		Son ref=new Son();
		ref.test();
		System.out.println(ref.add(10,20));
		System.out.println("main end");
		}
}