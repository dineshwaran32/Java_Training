package Day6;

import java.util.*;

public class P5 {
public static void main(String[] args) {
	HashSet l = new HashSet();
	l.add("dinesh");
	l.add("hello");
	l.add("every");
	l.add("one");
	l.add("Welcome");
	System.out.println(l);  //[one, Welcome, hello, every, dinesh]
	l.add("Welcome");
	l.add("hello");   
	System.out.println(l);  //[one, Welcome, hello, every, dinesh]
	//            linkedlist + hashtable
   // insertion order   not-preserverd    has insertion order
	
	
}
}
