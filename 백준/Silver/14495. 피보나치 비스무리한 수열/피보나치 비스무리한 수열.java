import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        // 1. 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // n의 범위가 1부터여서 추가함
        if (n == 1 || n == 2 || n == 3) {
            System.out.println(1);
            return;
        }
        
        // 2. dp 배열 선언
        long[] dp = new long [n+1];

        // 3. dp 배열 초기화
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 1;


        // 4. dp
        for (int i=4; i<=n; i++) {
            dp[i] = dp[i-1] + dp[i-3];
        }

        // 5. 출력
        System.out.println(dp[n]);
    }
}