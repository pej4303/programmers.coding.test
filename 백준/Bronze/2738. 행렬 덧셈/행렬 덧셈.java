import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        
        int[][] arrA = new int[m][n];
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                arrA[i][j] = sc.nextInt();
            }
        }
        
        int[][] arrB = new int[m][n];
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                arrB[i][j] = sc.nextInt();
            }
        }
        
        // 행렬의 덧셈
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                System.out.println( arrA[i][j] + arrB[i][j] );
            }
        } 
    }
}