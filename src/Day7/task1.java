package Day7;

import java.util.*;

public class task1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		String ch1 = s.next();
		String ch2 = s.next();
		Stack<Character> st = new Stack();
		for (char c : str.toCharArray()) {
			if (c == ch1.charAt(1)  && !st.isEmpty()) {
				if (st.peek() == ch1.charAt(0)){
					st.pop();
				}else {
					st.push(c);
				}
			}
			else if (c == ch2.charAt(1) && !st.isEmpty()) {
				if (st.peek() == ch2.charAt(0)){
					st.pop();
				}else {
					st.push(c);
				}
			}
			
			else {
				st.push(c);
			}
		}
		System.out.println(st);
		System.out.println(st.size());
	}
}
