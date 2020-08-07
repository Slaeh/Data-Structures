import java.util.Stack;

public class ReverseString {
	public String reverse(String string) {
		Stack<Character> stack = new Stack<>();
		for(int i = 0; i < string.length(); i++) {
			stack.push(string.charAt(i));
		}
		StringBuffer reversedString = new StringBuffer();
		while(!stack.isEmpty()) {
			reversedString.append(stack.pop());
		}
		return reversedString.toString();
	}
}
