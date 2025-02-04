package Day12;
import java.util.*;

public class task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n = s.nextInt();
        int m = 2;
        int[][] arr = new int[n][m];

        
        System.out.println("Enter " + n );
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = s.nextInt();
            }
        }

       
        /*for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j][1] > arr[j + 1][1]) { 
                    int temp0 = arr[j][0];
                    int temp1 = arr[j][1];

                    arr[j][0] = arr[j + 1][0];
                    arr[j][1] = arr[j + 1][1];

                    arr[j + 1][0] = temp0;
                    arr[j + 1][1] = temp1;
                }
            }
        }
        */
        Arrays.sort(arr,Comparator.comparingInt(i -> i[0]));
       System.out.println("Enter key : ");
       int key = s.nextInt();
        for (int i = n-key; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        s.close();
    }
}
