import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class StringList{
	public static void main(String[] args) {
		List<String>sl=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		sl.add("mmridul");
		sl.add("pawan");
		sl.add("murali");
		sl.add("balaji");
		System.out.print("Enter the name you want to remove: ");
		String name=sc.next();
		int index=sl.indexOf(name);
		if(index>=0 && index<sl.size()){
			sl.remove(index);
		}
		else{
			System.out.println("name not found on list");
		}
		System.out.println("Updated list: "+sl);

	}
}