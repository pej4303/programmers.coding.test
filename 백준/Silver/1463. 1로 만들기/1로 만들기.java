import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] dp = new int[n + 1];

        dp[1] = 0;

        for (int i=2; i<=n; i++) {
            // 3. 1을 뺀다.
            dp[i] = dp[i - 1] + 1; // 기본적으로 1을 빼는 연산
            
            // 1.X가 3으로 나누어 떨어지면, 3으로 나눈다.
            if (i % 3 == 0) {
                // i를 3으로 나눌 수 있으면 i/3에서 연산 1번(×3)만 추가하면 최소 연산 횟수 만들수 있다.
                dp[i] = Math.min(dp[i], dp[i / 3] + 1);
            }
            
            // 2. X가 2로 나누어 떨어지면, 2로 나눈다.
            if (i % 2 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            }
        }

        // 출력
        System.out.println(dp[n]);
    }
}