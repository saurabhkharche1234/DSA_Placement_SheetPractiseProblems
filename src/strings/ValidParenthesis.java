//program to check whether entered parenthesis are valid or not using deque

package strings;
import java.util.*;
public class ValidParenthesis {

	public static boolean isValid(String s) {
		Deque<Character> symbol = new ArrayDeque<Character>();
		for(char c: s.toCharArray()) {
			if(c == '{')
				symbol.push('}');
			else if(c=='[')
				symbol.push(']');
			else if(c=='(')
				symbol.push(')');
			else if(symbol.isEmpty()||symbol.pop() != c)
				return false;
		}
		
		return symbol.isEmpty();
	}
	
	public static void main(String[] args) {
		String s = "{[()]}";
		String t = "{[(]){";
		System.out.println(isValid(s));
		System.out.println(isValid(t));

	}

}
