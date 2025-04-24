import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] tmp = br.readLine().split(" ");
        
        int n = Integer.parseInt(tmp[0]);     // 계단 개수
        int k = Integer.parseInt(tmp[1]);     // 계단을 오르는 횟수
        
        int[] dp = new int[n+1];
        Arrays.fill(dp, Integer.MAX_VALUE);   // 최대값으로 초기화
        
        // 현재 민희는 0번째 계단에 있습니다.
        dp[0] = 0;
        
        for (int i=0; i<n; i++) {
            // 1. 계단 한 칸을 올라갑니다.
            if (i + 1 <= n) {
                dp[i + 1] = Math.min(dp[i + 1], dp[i] + 1);
            }
            // 2. 민희가 집에서 가지고 온 지팡이를 계단에 두드립니다. 
            // 만약 민희가 i번째 계단에서 지팡이를 두드리면 i + (i/2) 번째 계단으로 순간이동합니다.
            int jump = i + (i / 2);
            if (jump <= n) {
                dp[jump] = Math.min(dp[jump], dp[i] + 1);
            }
        }
        System.out.println(dp[n] <= k ? "minigimbob" : "water");
        
    }
}