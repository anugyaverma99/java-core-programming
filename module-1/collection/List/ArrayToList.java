import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class ArrayToList{
	public static void main(String[] args) {
		int[] arr={1,2,3,4,5,6};;
		List<Integer> l=new ArrayList<Integer>();
		for(int i:arr){
			l.add(i);
		}
		System.out.println(l);
		List<Integer> l2=Arrays.asList(1,2,3,4,5,6);
		System.out.println(l2);

		l.add(10);
		System.out.println(l);	
		l.remove(0);
		System.out.println(l);
		l2.add(12);
		System.out.println(l2); // UnsupportedOperationException
		l2.remove(1);
		System.out.println(l2);	 // UnsupportedOperationException

		// when the array is converted tolist using asList() method , we can not make any changes(add,remove) it is only used for iteration
		// REASON: since it is using Array while conversion which is immutable;
		// replacing can be done using set(index,value) method
	}
}