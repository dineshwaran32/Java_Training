package Day12;
import java.util.*;

public class task4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		int n = s.nextInt();
		int arr[][] = new int[m][n];
		int[] sm = new int[m];
		for(int i = 0 ;i<m;i++) {
			sm[i] = Integer.MAX_VALUE;
			for(int j = 0;j<n;j++) {
				arr[i][j] = s.nextInt();
				sm[i] = Math.min(sm[i] , arr[i][j]);;
			}
		}
		System.out.println();
		for(int i =0; i < sm.length;i++) {
			System.out.print(sm[i] + " ");
		}
		
	}
}
