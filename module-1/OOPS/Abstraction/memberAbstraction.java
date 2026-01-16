abstract class Father{
	
	abstract public void abs();
	static{
		System.out.println("Static initializer block");
	}
	{
		System.out.println("Instance initializer block");
	}
	public Father(){
		System.out.println("construcotr block");
	}
} 
class  