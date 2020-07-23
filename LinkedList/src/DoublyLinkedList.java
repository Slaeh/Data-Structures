public class DoublyLinkedList<E> {
	private static class Node<E>{
		private E data;
		private Node<E> last, next;
	
	
		public Node(E data){
			this.data = data;
			this.last = null;
			this.next = null;
		}
		
		public Node(E data, Node<E> last, Node<E> next) {
			this.data = data;
			this.last = last;
			this.next = next;
		}
	}
	
	private Node<E> head, tail;
	private int size;
	
	public DoublyLinkedList(Node<E> head, Node<E> tail) {
		this.head = null;
		this.tail = head;
		this.size = 0;
	}
	
	public boolean isEmpty() {
		return this.size == 0;
	}
	
	public int size() {
		return this.size;
	}
	
	public E first() {
		if(this.isEmpty()) return null;
		return this.head.next.data;
	}
	
	public E last() {
		if(this.isEmpty()) return null;
		return this.tail.last.data;
	}
	
	public void addFirst(E data) {
		Node<E> newNode = new Node<E>(data);
	    if(this.isEmpty()) {
	    	this.head.next = newNode;
	    	this.tail.last = newNode;
	    	newNode.last = this.head;
	    	newNode.next = this.tail;
	    	this.size++;
		}
	    
	    Node<E> lastHeader = this.head.next;
	    this.head.next = newNode;
		newNode.next = lastHeader;
		newNode.last = this.head;
		lastHeader.last = newNode;
	}
	
}
