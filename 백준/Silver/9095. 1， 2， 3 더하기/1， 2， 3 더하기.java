import java.util.*;

public class Main {
    public static void main(String[] args) {
        // n은 최대 10
        int[] dp = new int[11];

        // 초기값
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        // DP 계산
        /**
         * n   방법의 수
         * 1   1
         * 2   1+1, 2 => 2
         * 3   1+1+1, 1+2, 2+1 => 3
         * 4   1+1+1+1, 1+1+2, 1+2+1, 2+1+1, 2+2, 1+3, 3+1 => 7 = 4 + 2 + 1
         * 5   1+1+1+1+1, 1+1+1+2, 1+1+2+1, 1+1+3, 1+2+1+1, 1+2+2, 1+3+1,2+1+1+1, 2+1+2, 2+2+1, 2+3, 3+1+1, 3+2 => 13 = 7 + 4 + 2
         */
        for (int i=4; i<=10; i++) {
            /**
             * dp[4] = dp[3] + dp[2] + dp[1]
             * dp[4] = 4 + 2 + 1
             * dp[4] = 7
             */
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
//            System.out.println(dp[i]);
        }

        // 입력
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i=0; i<t; i++) {
            int n = sc.nextInt();
            // 출력
            System.out.println(dp[n]);
        }
    }
}