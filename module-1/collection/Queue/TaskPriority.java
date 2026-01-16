import java.util.*;
class Task implements Comparable<Task>{
	String task;
	int priority;
	Task(String task,int priority){
		this.priority=priority;
		this.task=task;
	}
	@Override
	public int compareTo(Task t){
		return Integer.compare(this.priority,t.priority);
	}
	@Override
	public String toString(){
		 return task+" "+priority;
	}
	
}
public class TaskPriority{
	public static void main(String[] args) {
		Queue<Task> q=new PriorityQueue<>();
		q.offer(new Task("revising notes",3));
		q.offer(new Task("attending classes",4));
		q.offer(new Task("wake up early",2));
		q.offer(new Task("extra-curricular activities",1));
		while(!q.isEmpty()){
			System.out.println(q.poll());
		}

		
	}
}