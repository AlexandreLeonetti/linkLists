
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