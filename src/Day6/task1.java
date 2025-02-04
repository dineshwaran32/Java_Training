package Day6;
import java.util.*;
public class task1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = 4;
		int i,j;
		int[][] a = new int[n][n];
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				a[i][j] = s.nextInt();
			}
		}
		for(i=0;i<n-2;i++) {
			for(j=i;j<n-i;j++) {
				System.out.print(a[i][j] +" ");
			}
			System.out.println();
			for(j=i+1;j<n-i;j++) {
				System.out.print(a[j][n-i-1] +" ");
			}
			System.out.println();
			for(j=n-i-2;j>=i;j--) {
				System.out.print(a[n-i-1][j]+" ");
			}
			System.out.println();
			for(j=n-i-2;j>i;j--) {
				System.out.print(a[j][i] +" ");
			}
			System.out.println();
		}
	}

}
