import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n + 1];
        int[] dp = new int[n + 1];

        for (int i=1; i<=n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        // 기본 초기값 설정 (n이 1, 2일 수도 있어서 따로 처리)
        dp[1] = arr[1];
        if (n >= 2) {
            dp[2] = arr[1] + arr[2];
        }

        // DP 점화식 적용
        for (int i = 3; i <= n; i++) {
            dp[i] = Math.max(dp[i - 1], 
                      Math.max(dp[i - 2] + arr[i], 
                               dp[i - 3] + arr[i - 1] + arr[i]));
        }

        // 출력
        System.out.println(dp[n]);
    }
}