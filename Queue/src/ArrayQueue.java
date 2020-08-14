import java.util.Arrays;

public class ArrayQueue {
	private int[] items;
	private int front, back, size;
	
	public ArrayQueue(int size) {
		items = new int[size];
	}
	
	public boolean isEmpty() {
		return this.size == 0;
	}
	
	public boolean isFull() {
		return this.size == items.length;
	}
	
	@Override
	public String toString() {
		return Arrays.toString(items);
	}
	
	public int peek() {
		if(this.isEmpty()) {
			throw new IllegalStateException();
		}
		return items[0];
	}
	
	public void enqueue(int data) {
		if(this.isFull()) {
			throw new StackOverflowError();
		}else {
			items[back] = data;
			this.back++;
			this.size++;
		}
	}
	
	public int dequeue() {
		if(this.isEmpty()) {
			throw new IllegalStateException();
		}else {
			this.size--;
			return(items[front++]);
		}
	}
}
