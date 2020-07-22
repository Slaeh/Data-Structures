public class Array {
	private int array[];
	private int counter;
	
	public Array(int size) {
		this.array = new int [size];
	}
	
	//O(n)
	public void insert(int value) {
		if(array.length == counter) {
			int [] copy = new int [counter * 2];
			for(int i =0; i < counter; i++) {
				copy[i] = array[i];
			}
			copy[counter] = value;
			array = copy;
			counter++;
		}else {
			array[counter] = value;
			counter++;
		}
	}
	
	//O(n)
	public void removeAt(int index) {
		if(index < 0 || index >= counter) {
			throw new IllegalArgumentException("Index not valid");
		}else {
			for(int i = index; i < counter-1; i++) {
				array[i] = array[i+1];
			}
			counter--;
		}
	}
	
	//O(n)
	public int indexOf(int value) {
		for(int i =0; i < counter; i ++) {
			if(array[i] == value) {
				return i;
			}
		}
		return -1;
	}
	
	//O(n)
	public int max() {
		int maximum = array[0];
		for(int i = 0; i < counter; i++) {
			if(array[i] > maximum) {
				maximum = array[i];
			}
		}
		return maximum;
	}
	
	//O(n^2)
	public void intersect(Array test2) {
		 for(int i = 0; i < counter; i ++) {
			for(int j = 0; j < counter; j++) {
				if(array[i] == test2.indexOf(j)) {
					System.out.print(i);
				}
			}
		}
		
	}
	
	//O(n)
	public void reverse() {
		int count = counter-1;
		int[] copy = new int[array.length];
		for(int i = 0; i < array.length ; i++) {
			copy[i] = array[count];
			count--;
		}
		array = copy;
	}
	
	//O(1)
	public void insertAt(int item, int index) {
		array[index] = item;
	}
	
	
	//O(n)
	public void print() {
		for(int i = 0; i < counter; i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.println();
	}
}