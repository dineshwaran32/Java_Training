package Day8;


/*
 * Pattern ids a class that creates a regular expression equation
 * It uses a method called compile to create a regex equivalent from a string
 * 
 * public pattern static compile(String str)
 * from the signature of the compile method is static which returns the same class object that it belongs to . Hence it is static factory method
  
 * Matcher belongs to pattern class and helps in matching the pattern with the string that is passed as an argument

 *  find() -> helps in find the pattern returns boolean
 *  start() -> the st pos of pattern returns int
 *  end() -> the end pos+1 of the patten return int
 *  group() -> returns the group of string that matches the pattern   
 */
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P4 {
	public static void main(String[] args) {
		int c = 0;
		Pattern p = Pattern.compile("ab");
		Matcher m = p.matcher("ababbabaabbbabaa");
		while(m.find()) {
			c++;
			System.out.println(m.start() + "  " + m.end());
		}
		System.out.println(c);
		
	}
}
