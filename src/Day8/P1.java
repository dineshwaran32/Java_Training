package Day8;

/*
 * put(key , value);
 * If the key is not present in the map then the method will return null and inserts the new entry into the
 * void putAll();  // entry the map 
 */

/*

 		m.put(args, a);
		m.putAll(m);
		m.get(a);
		m.remove(a);
		m.containsKey(a);
		m.containsValue(a);
		m.isEmpty();
		m.size();
		m.clear();
		m.keySet();
		m.values();
		m.entrySet();
		
 */

/*
 * Map is a group of key value pairs and each kay -vaue is called as entry
 * hence map is considered as collection of entry object
 * without existing map object there is no chance of entry existance
 * hence entry interface is defined inside map interface 
 
 * object getkey();
 * object getvalue();
 * object setvalue();
 */


/*
 * HASHMAP
 * 
 * underlying DS is hashtable
 * insertion is not preserved
 * insertion is based on hashcode of key
 * duplicates are not allowed ( for key , not value)
 * heterogeneus obj are allowed for both key
 * null is allowed for a key only once
 * null is allowed for values any number of times
 * maps implement serializable and clonable but not random
 * 
 * 
 */
import java.util.*;

public class P1 {
	public static void main(String[] args) {
		Map<String,Integer> m = new HashMap<String,Integer>();
		m.put("Dinesh",39);
		m.put("butter" , 55);
		m.put("mukesh" , 59);
		System.out.println(m);  // {butter=55, mukesh=59, Dinesh=39}
		
		/*Set<Integer> set=m.keySet();

		 //Collection arr= map.values();

		 System.out.println(set);

		 //System.out.println(arr);
		// for(Map.Entry<Integer,String> i: map.entrySet()) {
		// System.out.println(i.getKey()+" : "+i.getValue());
		// }
		 Iterator itr=set.iterator();
		 while(itr.hasNext()) {
		  System.out.println(itr.next()); 
		 }
		 */
		 		
	}

}
