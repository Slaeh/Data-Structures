
public class LinkedList<E> {
	
	private static class Node<E> {
		 private E data;
		 private Node<E> next;
		
		public Node(E data) {
			this.data = data;
			this.next = null;
		}
		
		public Node(E data, Node<E> next) {
			this.data = data;
			this.next = next;
		}
	}
	
	private Node<E> head, tail;
	private int size;
	
	public LinkedList() {
		this.head = new Node<>(null);
		this.tail = head;
		this.size = 0;
	}
	
	public int size() {
		return this.size;
	}
	
	private boolean isEmpty() {
		return(this.size == 0);
	}
	
	public void addFirst(E data) {
		Node<E> newNode = new Node<>(data);
		if(this.isEmpty()) {
			this.head = newNode;
			this.tail = newNode;
		}
		newNode.next = head;
		head = newNode;
		this.size++;
	}
	
	public void addLast(E data) {
		Node<E> newNode = new Node<>(data);
		if(this.isEmpty()) {
			this.head = newNode;
			this.tail = newNode;
		}
		tail.next = newNode;
		tail = newNode;
		this.size++;
	}
	
	public void removeFirst() {
		Node<E> newNode = head.next.next;
		head.next.next = null;
		head.next = newNode;
		this.size--;
	}
	
	public int indexOf(E data) {
		int index = 0;
		Node<E> current = this.head;
		while(current.next != null) {
			if(current.data == data) {
				return index;
			}else {
				index++;
			}
		}
		return -1;
	}
	
	public boolean contains(E data) {
		return indexOf(data) != -1;
	}
	
}
