import java.util.Stack;
import java.util.List;
import java.util.Scanner;

class validParenthesis{
	public static boolean validParenthesis(String str){
		Stack<Character> cl=new Stack<>();
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);

		if(ch=='(' || ch=='{' || ch=='['){
				cl.push(ch);
			}
			else if(ch==')'){
				if(cl.peek()=='('){
					cl.pop();
				}
				else{
					return false;
				}

			}
			else if(ch=='}'){
				if(cl.peek()=='{'){
					cl.pop();
				}
				else{
					return false;
				}
			}
			else if(ch==']'){
				if(cl.peek()=='['){
					cl.pop();
				}
				else{
					return false;
				}
			}
			
		}
		return cl.empty();
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String str=sc.next();


			
		System.out.println(validParenthesis(str));

	
}
}