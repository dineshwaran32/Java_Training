package Day11;

import java.util.Arrays;

public class P7 {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		String arr1[] = {"g","gr","gra","gran","grand","grandm","grandma"};
		System.out.println(arr);		//it print the hashcode  //[I@47f6473
		System.out.println(Arrays.toString(arr));   //[1, 2, 3, 4, 5]
		System.out.println(Arrays.toString(arr1));
		for(int i = 0;i < arr1.length;i++) {
			System.out.println(arr1[i] + " ");
		}
	}

}
