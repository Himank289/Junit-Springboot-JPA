package datastructures1;

public class LinkedListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkList l=new LinkList();
		l.add(90);
		l.add(89);
		l.add(34);
		l.add(55);
		l.add(77);
		l.display();
		l.del(90);
		l.display();
		
	}

}


class LinkList{
	class Node{
		int data;
		Node next;
		
		Node (int data){
			this.data=data;
			this.next=null;
		}
	}
	Node head=null;
	
	void add(int data) {
		Node newnode=new Node(data);
		Node current=null;
		
		if(head==null) {
			head=newnode;
		}
		else {
			current=head;
			while(current.next!=null) {
				current=current.next;
				
			}
			current.next=newnode;
		}
	}
	
	void display() {
		
		Node current=head;
		while(current!=null) {
			System.out.print(+current.data+"->");
			current=current.next;
		}
		
	}
	
//	void del(int data) {
//		Node current=head;
//		Node prev=head;
//		while(current!=null) {
//			if(current.data==data) {
//			prev.next=current.next;
//				current.next=null;
//				break;
//			}
//		prev=current;
//		current=current.next;
//			
//		}
//		
//	}
	
	void del(int data) {
	    Node current = head;
	    Node prev = null;

	    while (current != null) {
	        if (current.data == data) {
	            if (prev == null) {
	               
	                head = current.next;
	            } else {
	                prev.next = current.next;
	            }

	            current.next = null;
	            break;
	        }

	        prev = current;
	        current = current.next;
	    }
	}
}
