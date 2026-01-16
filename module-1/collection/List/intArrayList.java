import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class intArrayList{
	public static void main(String[] args) {
		List <Integer> l=new ArrayList<>();
		l.add(10);
		l.add(5);
		l.add(20);
		l.add(15);
		l.add(25);
		System.out.println("Original list: "+l);
		l.add(2,12);
		System.out.println("New list: "+l);
		if(l.contains(15)){
			System.out.println("number is present on the list");
		}
		else{
			System.out.println("number is not present in the list");
		}
		Collections.sort(l);
		l.remove(0);
		System.out.println("Final list: "+l);
		System.out.println("size of the list: "+l.size());
	}
}