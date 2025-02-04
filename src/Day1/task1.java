package Day1;
import java.util.*;
public class task1 {
public static void main(String args[]) {
Scanner s = new Scanner(System.in);
int i ,j;

int n=4;
int k;
for ( i = 1; i <=n; i++) {
	k=i;
    for ( j = i; j < n; j++) {
        System.out.print(" ");
    }
    for (j = 1; j <= i; j++) {
        System.out.print(k + " ");
        k+=2;
    	}
    System.out.println();
}



for ( i = n - 1; i >= 1; i--) {
    k =i;
    for ( j = n; j > i; j--) {
        System.out.print(" ");
    }
    
    for (j = 1; j <= i; j++) {
    	System.out.print(k + " ");
        k+=2;
     }
   
    System.out.println();
}
}
}

