package Day7;

import java.util.*;
/*
 * VECTOR : 
  		- legacy class
  		- underlying data structure  -> resizable array
  		- insertion order
  		- duplicate allowed
  		- heterogeneous
  		- null support
  		- best scenario - retrieve
  		- new_capacity = current_capacity * 2;
  		- resizing of vector is expensive process because when a new arraylist is created the data from the old is to be copied to the new area
 */

/*
 * VECTOR Constructors

  	Vector v = new Vector(); // default 
	Vector v = new Vector(int 5);   // (capacity)
	Vector v1 = new vector(int 4, int 6);   // (initial capacity , increment capacity)
	Vector v = new Vector(Collection c);  // (collection)
 */

/*
 * VECTOR Methods
 
 		v.addElement(null);
		v.removeElement(s);
		v.removeAllElements();
		v.elementAt(0);
		v.firstElement();
		v.lastElement();
		v.size();
		v.capacity();
		v.elements();
		
 */


public class P1 {
	public static void main(String[] args) {
		Vector v = new Vector();
		Vector v1 = new Vector(10,5);
		ArrayList<String> s = new ArrayList<String>();
		for(int i=0;i<10;i++) {
			v.addElement(i);
			v1.addElement(i);
		}
		System.out.println(v);   //  [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
		System.out.println(v.capacity()); //10
		v.addElement("Dinesh");
		v1.addElement("Dinesh");
		System.out.println(v);   //  [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, Dinesh]  ->hetrogeneous
		System.out.println(v.capacity());   //20   -> increments twice the actual capacity
		
		System.out.println(v1.capacity());  //15
		
	 
		

	}

}
