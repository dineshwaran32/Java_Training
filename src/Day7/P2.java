package Day7;
import java.util.*;

/*
 * STACK
 
 * Default constructor in stack
 * it is the child class of vector
 */


/*
 * Stack methods 
 
 		s.push(1);
		s.pop();
		s.peek();
		s.empty();
		s.search(3);
		
 */



public class P2 {
	public static void main(String[] args) {
		Stack s = new Stack();
		for(int i=0;i<10;i++) {
			s.push(i);
		}
		
		System.out.println(s);   //[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]    -> because it is based on list interface so it uses insertion order only for print 
		System.out.println(s.size());  //10
		
		
		System.out.println(s.pop());  //9
		System.out.println(s);   //[0, 1, 2, 3, 4, 5, 6, 7, 8]
		System.out.println(s.peek());   //8
		
		
	}
}
