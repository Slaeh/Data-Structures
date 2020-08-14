
public class Stack {
	private int[] data;
	private int counter;
	
	public boolean isEmpty() {
		return this.counter == 0;
	}
	
	public void push(int item) {
		if(counter == data.length) {
			throw new StackOverflowError();
		}else {
			data[counter] = item;
			counter++;
		}
	}
	
	public int pop() {
		if(this.isEmpty()) {
			throw new IllegalStateException();
		}else {
			return data[--counter];
		}
	}
	
	public int peek() {
		if(this.isEmpty()) {
			throw new IllegalStateException();
		}else {
			return data[counter -1];
		}
	}
}
