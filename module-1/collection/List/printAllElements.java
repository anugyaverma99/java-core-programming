import java.util.ArrayList;
import java.util.List;

class printAllElements{
	public static void main(String[] args) {
		List l=new ArrayList();
		l.add(45);
		l.add("hello");
		l.add(34.5);
		l.add(56);
		for(int i=0;i<l.size();i++){
			System.out.println(l.get(i));
		}
	}
}