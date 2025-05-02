import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 방법1) 완전탐색 = 브루트 포스
        // 시간 초과 발생
//        long max = arr[0];
//        for (int i=0; i<n; i++) {
//            long sum = 0;
//            for (int j=i; j<n; j++) {
//                sum += arr[j];
//                max = Math.max(max, sum);
//            }
//        }

        // 방법2) DP 이용
        long max = arr[0];
        long sum = arr[0];

        /**
         * arr = [10 -4 3 1 5 6 -35 12 21 -1]
         *
         * sum = 10, max = 10
         *
         * arr[1] = -4 → sum = max(-4, 10 + (-4)) = max(-4, 6) = 6 → max = max(10, 6) = 10
         * arr[2] =  3 → sum = max(3, 6 + 3) = max(3, 9) = 9     → max = max(10, 9) = 10
         * arr[3] =  1 → sum = max(1, 9 + 1) = max(1, 10) = 10   → max = max(10, 10) = 10
         * arr[4] =  5 → sum = max(5, 10 + 5) = max(5, 15) = 15  → max = max(10, 15) = 15
         */
        for (int i=1; i<n; i++) {
            sum = Math.max(arr[i], sum + arr[i]);
            max = Math.max(max, sum);
        }

        // 출력
        System.out.println(max);
    }
}