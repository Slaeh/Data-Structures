public class Array {
	private int array[];
	private int counter;
	
	public Array(int size) {
		this.array = new int [size];
	}
	
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
	
	public void removeAt(int index) {
		if(index < 0 || index >= counter) {
			throw new IllegalArgumentException("Index not valid");
		}else {
			for(int i = index; i < counter; i++) {
				array[i] = array[i+1];
			}
			counter--;
		}
	}
	
	public int indexOf(int value) {
		for(int i =0; i < counter; i ++) {
			if(array[i] == value) {
				return i;
			}
		}
		return -1;
	}
	
	public int max() {
		int maximum = array[0];
		for(int i = 0; i < counter; i++) {
			if(array[i] > maximum) {
				maximum = array[i];
			}
		}
		return maximum;
	}
	
	public void print() {
		for(int i = 0; i < counter; i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.println();
	}
}