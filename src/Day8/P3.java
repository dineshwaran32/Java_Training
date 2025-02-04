package Day8;

import java.util.*;

/*
 * 
 * firstkey();
 * lastkey();
 * headmap(key);
 * tailMap(key);
 * subMap(key1,key2);
 * comparator();
 */

/*
 * new treeMap()
 * new TreeMap(comparator c);
 * new TreeMap(Map mp);
 * new TreeMap(SortedMap);
 */
import java.util.TreeMap;

class Mycomparator implements Comparator {
	public int compare(Object obj1 , Object obj2) {
		String s1 = (String) obj1;
		String s2 = (String) obj2;
		return -s2.compareTo(s1);
		
	}
}
public class P3 {

	public static void main(String args[]) {
		TreeMap t = new TreeMap();
		t.put(1, "tea");
		t.put(2, "coffee");
		t.put(4, "dosa");
		t.put(3, "idli");
		System.out.println(t);
		t.put("6", 6);
		System.out.println(t);
	}
}
