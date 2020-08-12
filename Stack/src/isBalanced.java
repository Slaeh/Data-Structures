import java.util.Stack;
public class isBalanced {
	public boolean Balance(String input) {
		Stack<Character> stack = new Stack<>();
		for(int i = 0; i < input.length(); i++) {
			if(input.charAt(i) == '(' || input.charAt(i) == '<' || input.charAt(i) == '[' || input.charAt(i) == '{') {
				stack.push(input.charAt(i));
			}
			if(input.charAt(i) == ')' || input.charAt(i) == '>' || input.charAt(i) == ']' || input.charAt(i) == '}') {
				if(stack.isEmpty()) {
					return false;
				}else {
					var symbol = stack.pop();
					if(symbol =='(' && input.charAt(i) != ')' || 
					   symbol == '<' && input.charAt(i) != '>'||
					   symbol == '[' && input.charAt(i) != ']'||
					   symbol == '{' && input.charAt(i) != '}') {
						
						return false;
					}
				}
			}
		}
		return true;
	}
}
