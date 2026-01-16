import java.util.*;
class IteratorFunction{
	public static void main(String[] args) {
		int [] arr={10,21,23,25,26};
		List<Integer>l=new ArrayList<Integer>();
		for(int i:arr){
			l.add(i);
		}
		System.out.println(l);
		Iterator<Integer>itr=l.iterator();
		// while(itr.hasNext()){
		// 	System.out.println(itr.next());
		// }
		while(itr.hasNext()){
			itr.next();
			itr.remove();
			System.out.println(l);
		}
	}
}