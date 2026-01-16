import java.util.*;
class ListOperations{
	public static void main(String[] args) {
		int [] arr={10,21,23,25,26,28,22,23,21,24,25,26};
		List<Integer> al=new ArrayList<>();
		for(int i:arr){
			al.add(i);
		}

		// FOR EACH LOOP- we can only use it for iteration any changes applied to list can not be performed using for each loop.

		// for(int i:al){
		// 	if(i%2!=0){
		// 		int index=al.indexOf(i);
		// 		al.remove(index);
		// 	}
		// }


		int length=al.size();


		for(int i=0;i<length;i++){
			int element=al.get(i);
			if(element%2!=0){
				al.remove(i);
			}
		}

		// for(int i=length-1;i>=0;i--){
		// 	int element=al.get(i);
		// 	if(element%2!=0){
		// 		al.remove(i);
		// 	}
		// }


		System.out.println(al);
	}
}