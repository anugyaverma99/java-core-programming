import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class stringArrayList{
	public static void main(String[] args) {
		List<String>l=new ArrayList<>();
		l.add("Delhi");
		l.add("Mumbai");
		l.add("Chennai");
		l.add("Kolkata");
		System.out.println(l);
		l.add(2,"Bangalore");
		System.out.println(l);
		if(l.contains("Mumbai")){
			System.out.println("Mumbai is present in the list");
		}
		else{
			System.out.println("Mumbai is not present in the list");
		}
		Collections.sort(l);
		System.out.println("sorted list: "+l);
		Collections.revere(l);
		System.out.println("Reverse list: "+l);
		l.clear();
		System.out.println(l.size());
		
	}
}