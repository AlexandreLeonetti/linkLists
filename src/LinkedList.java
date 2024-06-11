public class LinkedList{
	public static Node head;

	public static void appendLink(int value) {
		if(head == null) {
			head = new Node(value);
			return;
		}
		Node current = head;
		while(current.next!=null) {
			current= current.next;
		}
		current.next = new Node(value);
	}
	
	public static void showLinks() {
		Node n = head;
		while(n!=null) {
			System.out.println("value : "+n.data);
			//System.out.println("next : "+n.next.data);
			n=n.next;
		}

		
	}
	
	public static void main(String[] args) {
		System.out.println("testing link lists");
		appendLink(3);
		appendLink(22);
		appendLink(1200);
		
		showLinks();
		
	}
}






































































































/*
public class LinkedList{
	static Node head;
	// function append node 
	public static void append( int value) {
		if(head==null) {
			head=new Node(value);
			return;
		}
		Node current = head;
		while(current.next!=null) {
			current = current.next;
		}
		current.next = new Node(value);
	}

	// function readList
	
	public static void readList(Node n) {
		if(n==null) {
			System.out.println("no nodes \n");
			return;
		}
		while(n!=null) {
			System.out.println("node value : "+n.data+"\n");
			n=n.next;
		}

	}
	
	
	
	
	public static void main(String[] args) {
	
		append(1);
		append(2);
		append(55);
		append(88);
		
		readList(head);
	}
}
*/