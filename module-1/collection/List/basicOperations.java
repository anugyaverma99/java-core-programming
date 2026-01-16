import java.util.ArrayList;
import java.util.List;
class basicOperations{
	public static void main(String[] args) {
		List al=new ArrayList();
		al.add(10);
		al.add(10.5);
		al.add("string");
		al.add(false);
		System.out.println(al);
		System.out.println(al.size());
		al.add(15);
		System.out.println(al.size());
		System.out.println(al.get(1));
		al.add(null);
		System.out.println(al);

	}
}