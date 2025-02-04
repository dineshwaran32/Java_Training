package Day7;

import java.util.*;

/*

 * Iterator
 * ->Applicable for all Collections object.
 * ->Can perform both read and remove operation.
 * Limitation:
 * -> Only forward direction movement in enumeration and iterator.
 * -> Only read and remove operation present.
 * -> No possibility of replacement and add.
 */

public class P5 {

	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		for (int i = 1; i <= 10; i++) {
			arr.add(i);
		}
		Iterator itr = arr.iterator();
		// arr.forEach((i)->System.out.println(i));
		while (itr.hasNext()) {
			int i = (int) itr.next();
			if (i % 2 == 0)
				System.out.println("Even :" + i);
			else
				itr.remove();
		}
		System.out.println(arr);
	}
}