import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        StringTokenizer st = null;
        // 1. 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];

        arr[0][0] = Integer.parseInt(br.readLine());

        for (int i=1; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<=i; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        // 2. dp
        int[][] dp = new int [n][n];
        // 초기값 셋팅
        dp[0][0] = arr[0][0];

        for (int i=1; i<n; i++) {
            for (int j=0; j<=i; j++) {
                if (j == 0) {
                    // 왼쪽 끝: 위에서만 올 수 있음
                    dp[i][j] = dp[i-1][j] + arr[i][j];
                } else if (j == i) {
                    // 오른쪽 끝: 위 왼쪽에서만 올 수 있음
                    dp[i][j] = dp[i-1][j-1] + arr[i][j];
                } else {
                    // 중간: 위와 위 왼쪽에서 둘 다 올 수 있음
                    dp[i][j] = Math.max(dp[i-1][j-1], dp[i-1][j]) + arr[i][j];
                }
            }


        }

        // 3. 출력
        int reuslt = Arrays.stream(dp[n-1]).max().getAsInt();
        System.out.println(reuslt);
    }
}