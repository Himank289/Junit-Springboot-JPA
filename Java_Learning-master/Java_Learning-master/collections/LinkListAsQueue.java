package collections;
import java.util.*;

public class LinkListAsQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue <Integer> q=new LinkedList<Integer>();
		q.offer(89);
		q.offer(55);
		q.offer(77);
		
		System.out.println(q.size());
		System.out.println(q.peek());
		System.out.println(q.poll());
		System.out.println(q.size());
		
		q.forEach((Integer i)->System.out.println(i));

	}

}
