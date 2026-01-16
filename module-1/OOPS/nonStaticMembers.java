public class nonStaticMembers{
	{
		System.out.println("inside non static block");
	}
	public void test(){
		System.out.println("Inside test method");
	}
	public static void main(String[] args) {
		System.out.println("inside main method");		
	}
	static{
		nonStaticMembers ref=new nonStaticMembers();
		ref.test();
	}
}