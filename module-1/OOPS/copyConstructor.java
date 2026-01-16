import java.util.*;

class copyConstructor{
	int id;
	String name;
	int[] marks=new int[3];

	public copyConstructor(int id,String name,int[] marks){
		this.id=id;
		this.name=name;
		this.marks=marks;
	}

	public copyConstructor(copyConstructor obj){
		this.id=obj.id;
		this.name=obj.name;
		this.marks=obj.marks;
	}

	public static void main(String[] args) {
		int[] marks={1,2,3};
		copyConstructor ref1=new copyConstructor(1,"anugya",marks);
		System.out.println("Original data: ");
		System.out.println("student id: "+ref1.id);
		System.out.println("student name: "+ref1.name);
		System.out.println("student marks: "+Arrays.toString(ref1.marks));
		copyConstructor ref2=new copyConstructor(ref1);
		System.out.println("after copy constructor");
		System.out.println("student id: "+ref2.id);
		System.out.println("student name: "+ref2.name);
		int[] new_marks={2,4,6};
		ref2.marks=new_marks;
		System.out.println("student marks: "+Arrays.toString(ref2.marks));


	}




}