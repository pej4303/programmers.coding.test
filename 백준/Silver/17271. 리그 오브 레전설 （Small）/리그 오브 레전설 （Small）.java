import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());  // 총 싸움시간
        int m = Integer.parseInt(st.nextToken());  // B스킬 시전 시간

        int mod = 1_000_000_007;

        int[] dp = new int[n + 1];
        dp[0] = 1;

        for (int i = 1; i <= n; i++) {
            // 스킬 A (1분) 사용: 이전 시간(i-1분)에 A 하나 붙이면 i분 가능
            dp[i] = dp[i - 1];
            // 스킬 B (m분) 사용: i가 m 이상일 때만 가능
            // 이전 시간(i - m분)에 B 하나 붙이면 i분 가능
            if (i >= m) {
                dp[i] = (dp[i] + dp[i - m]) % mod;
            }
        }

        // 출력
        System.out.println(dp[n]);
    }
}