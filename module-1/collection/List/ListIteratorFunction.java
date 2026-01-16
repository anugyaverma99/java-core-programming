import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;

class ListIteratorFunction{
	public static void main(String[] args) {
		String[] arr={"suraj","mridul","kabir","girish"};
		List<String>al=new ArrayList<String>();
		for(String i:arr){
			al.add(i);

		}
		System.out.println(al);
		ListIterator<String>ltr=al.listIterator();
		// System.out.println(hasPrevious()); //false
		// System.out.println(ltr.previous()); //NoSuchElementException
		// System.out.println("forward");
		// while(ltr.hasNext()){
		// 	System.out.println(ltr.next());
		// }
		// while(ltr.hasPrevious()){
		// 	System.out.println(ltr.previous());
		// }

		while(ltr.hasNext()){
			ltr.next();
		}
		while(ltr.hasPrevious()){
			ltr.previous();
			ltr.remove();
			System.out.println(al);
		}

	}
}