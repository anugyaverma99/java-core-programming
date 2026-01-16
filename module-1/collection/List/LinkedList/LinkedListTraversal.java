import java.util.*;
class Node{
	int data;
	Node previous;
	Node next;
	Node(int data){
		this.data=data;
		this.next=null;
		this.previous=null;
	}
}
class LinkedListTraversal{
	static Node head;
	public static void insertData(int data){
		Node n=new Node(data);
		if(head==null){
			head=n;
			return ;
			}
			Node temp=head;
			while(temp.next!=null){
				temp=temp.next;
			}
			temp.next=n;
			n.previous=temp;
	}
	public static void traverseForward(){
		Node temp=head;
		while(temp!=null){
			System.out.print(temp.data+" -> ");
			temp=temp.next;
		}
	}
	public static void traverseBackward(){
		Node temp=head;
		while(temp.next!=null){
			temp=temp.next;
			}
			while(temp.previous!=null){
				System.out.print(temp.data+" ");
				temp=temp.previous;
			}
	}
	public static void main(String[] args){
	
			
			insertData(15);
			insertData(16);
			insertData(17);
			insertData(18);
			insertData(19);
			insertData(20);
			traverseForward();
			System.out.println();
			traverseBackward();
		

	}

}