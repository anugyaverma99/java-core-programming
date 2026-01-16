class Person{
	private int age;
	private String name;
	private String country;

	public int getAge(){
		return age;		
	}

	public String getName(){
		return name;
	}

	public String getCountry(){
		return country;
	}

	public void setAge(int age){
		this.age=age;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setCountry(String country){
		this.country=country;
	}


}

public class getterSetter{
	public static void main(String[] args) {
		Person obj=new Person();
		obj.setAge(21);
		obj.setName("anugya");
		obj.setCountry("india");
		System.out.println(obj.getAge());
		System.out.println(obj.getName());
		System.out.println(obj.getCountry());

	}
}