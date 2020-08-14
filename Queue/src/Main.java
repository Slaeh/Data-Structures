import java.util.Arrays;
import java.util.Queue;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		/*Queue<Integer> queue = new ArrayDeque<>();
		queue.add(10);
		queue.add(20);
		queue.add(30);
		System.out.println(queue);
		reverseQueue(queue);
		System.out.println(queue);*/
		
		ArrayQueue arr = new ArrayQueue(5);
		arr.enqueue(0);
		arr.enqueue(1);
		arr.enqueue(2);
		System.out.println(arr);
	}
	
	public static void reverseQueue(Queue<Integer> queue) {
		if(queue.isEmpty()) {
			throw new IllegalStateException();
		}else{
			Stack<Integer> stack = new Stack<>();
			while(!queue.isEmpty()) {
				stack.push(queue.remove());
			}
			while(!stack.isEmpty()) {
				queue.add(stack.pop());
			}
		}
	}
}
