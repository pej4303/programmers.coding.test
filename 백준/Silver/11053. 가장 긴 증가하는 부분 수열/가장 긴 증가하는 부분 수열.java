import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 1. 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 2. dp 배열 생성
        int[] dp = new int[n];
        Arrays.fill(dp, 1);  // 자기 자신만 있는 경우 길이 1

        for (int i=0; i<n; i++) {
            for (int j=0; j<i; j++) {
                if (arr[j] < arr[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        // 3. 출력
        int result = 0;
        for (int i=0; i<n; i++) {
            result = Math.max(result, dp[i]);
        }

        System.out.println(result);
    }
}