interface Father{
	public static void test();
}
interface Mother{
	public static void demo();
}
class Son implements Father,Mother{
	@Override
	public static void demo(){
		System.out.println("abstracted father class");
	}
	@Override
	public static void test(){
		System.out.println("abstracted mother class");
	}
}
class multipleInheritance{
	public static void main(String[] args) {
		
	
	Father ref=new Son();
	Mother ref1=new Son();
	ref.test();
	ref1.demo();



 }

}