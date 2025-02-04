package Day11;
import java.util.*;

//STREAM

/*
 * Sequence of data elements  used to process data effeciently 
 * present in java.util.Stream
 * Stream can be created using either collections or arrays or I/O
 * Stream data are immutable
 * map,reduce ,transformations on collection
 * 
 * streams provide concise and readable way to perform operations like filtering , mapping , sorting , reducing
 * functional programming - clean code using lamba expressions
 * operations do not modify the original data but return the new streams with resources
 * 
 *  sequential stream and parallel processing streams 
 */


//Sequential stream

public class P4 {
	public static void main(String[] args) {
		List<String> nn = Arrays.asList("Dinesh","Butter", "Mukesh","Grandma");
		
		System.out.println("Processing sequential stream");
		nn.stream().forEach(i->System.out.println(i));
	}
}
