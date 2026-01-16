class Employee{
	private int employee_id;
	private String employee_name;
	private double employee_salary;

	public void setId(int id){
		this.employee_id=id;
	}
	public void setName(String name){
		this.employee_name=name;
	}
	public void setSalary(double salary){
		this.employee_salary=salary;
	}

	public int getId(){
		return employee_id;
	}
	public String getName(){
		return employee_name;

	}
	public String getSalary(){
		return "salary: "+employee_salary;		
	}
}
public class getterSetter2{
	public static void main(String[] args) {
		Employee e=new Employee();
		e.setName("anugya");
		e.setId(1);
		e.setSalary(50000);
		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(e.getSalary());
	}
}