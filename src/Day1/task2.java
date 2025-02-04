package Day1;
import java.util.*;
public class task2 {
	public static void main(String args[]) {
		int i,j,k=3,n;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(k++ + " ");
			}
			System.out.println();
		}
		k = k-(n-1);
		for(i=n;i>1;i--) {
			for(j=i;j>1;j--) {
				System.out.print(k-j + " ");
			}
			k = k-i+1;
			System.out.println();
		}
		}

}
