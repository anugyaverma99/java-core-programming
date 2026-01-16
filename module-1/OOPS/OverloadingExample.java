 class OverloadingExample{
 	static void display(int a){
 		System.out.println("static method-1");
 	}
 	static void display(String a){
 		System.out.println("static method-2");
 	}
 	void display(int a,String b){
 		System.out.println("non static method-1");
 	}
 	void display(){
 		System.out.println("default method");
 	}
 	public static void main(String[] args) {
 		OverloadingExample ref=new OverloadingExample();
 		display(1);
 		display("example");
 		ref.display(1,"example");
 		ref.display();

 	}

 }