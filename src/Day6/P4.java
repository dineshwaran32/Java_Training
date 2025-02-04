package Day6;

import java.util.*;

public class P4 {
public static void main(String[] args) {
	LinkedList l = new LinkedList();
	l.add("dinesh");
	l.add("hello");
	l.add("every");
	l.add("one");
	l.add("Welcome");
	System.out.println(l);  //[dinesh, hello, every, one, Welcome]
	System.out.println(l.getFirst());  //dinesh
	System.out.println(l.getLast()); //Welcome
	System.out.println(l.removeFirst()); //dinesh
	System.out.println(l.removeLast());  //Welcome
	l.addFirst("Appennd it ");  
	System.out.println(l);   //[Appennd it , hello, every, one]
	l.set(1, "Set method");
	System.out.println(l);  //[Appennd it , Set method, every, one]
	

	
	
}
}
