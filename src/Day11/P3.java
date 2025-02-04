package Day11;
import java.util.*;
public class P3 {
	public static void main(String[] args) {
		List<String> nn = Arrays.asList("Dinesh","Butter", "Mukesh","Grandma");
		
		Collections.sort(nn,(i,j)-> i.compareTo(j));
		System.out.println(nn);
		
		
	}
}
