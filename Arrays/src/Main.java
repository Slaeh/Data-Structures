public class Main {
	public static void main(String[] args) {
		Array test = new Array(3);
		test.insert(1);
		test.insert(2);
		test.insert(3);
		test.insert(4);
		test.insert(5);
		test.print();
		test.removeAt(3);
		test.print();
		System.out.println(test.indexOf(2));
	}
}

