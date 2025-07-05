import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        StringTokenizer st = null;

        // 1. 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());    // 집의 수

        int[][] arr = new int[n][3]; // 각 집의 R,G,B 비용 저장

        for (int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());

            arr[i][0] = Integer.parseInt(st.nextToken()); // 빨강
            arr[i][1] = Integer.parseInt(st.nextToken()); // 초록
            arr[i][2] = Integer.parseInt(st.nextToken()); // 파랑
        }

        // 2. DP 테이블
        // 집 번호(i)와 색(j)라는 두 상태를 저장해야 해서 2차원 배열로 선언
        int[][] dp = new int[n][3];

        // 초기화
        dp[0][0] = arr[0][0];
        dp[0][1] = arr[0][1];
        dp[0][2] = arr[0][2];

        // 3. DP
        for (int i=1; i<n; i++) {
            dp[i][0] = Math.min(dp[i-1][1], dp[i-1][2]) + arr[i][0];
            dp[i][1] = Math.min(dp[i-1][0], dp[i-1][2]) + arr[i][1];
            dp[i][2] = Math.min(dp[i-1][0], dp[i-1][1]) + arr[i][2];
        }

        // 4. 출력
        int result = Math.min(dp[n-1][0], Math.min(dp[n-1][1], dp[n-1][2]));
        System.out.println(result);
    }
}