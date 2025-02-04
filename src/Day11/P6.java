package Day11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class P6 {
	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("apple","mango","pomogrennate","banana", "grapes" , "melon" , "pineapple" , "papaya");
		List<String> lst = fruits.stream().filter(i -> i.startsWith("p")).map(String::toUpperCase).sorted().collect(Collectors.toList());
		System.out.println(lst);
		
		
		List<Integer> l1 = fruits.stream().map(String::length).collect(Collectors.toList());
		System.out.println(l1);
		
		List<String> l2 = fruits.stream().filter(i -> i.contains("c")).map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(l2);
		
		String stname = fruits.stream().filter(i -> i.startsWith("a")).findFirst().orElse("No name Found"); 
		System.out.println(stname);
	}

}
