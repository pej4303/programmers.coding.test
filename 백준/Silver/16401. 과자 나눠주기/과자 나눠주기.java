import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        StringTokenizer st = null;
        // 1. 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫째 줄에 조카의 수 M (1 ≤ M ≤ 1,000,000), 과자의 수 N (1 ≤ N ≤ 1,000,000)이 주어진다.
        st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken());   // 조카의 수
        int n = Integer.parseInt(st.nextToken());   // 과자의 수

        st = new StringTokenizer(br.readLine());

        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 2. 로직 - 이분탐색
        long result = 0;
        int left = 1;
        int right = Arrays.stream(arr).max().getAsInt();    // 과자 배열의 최대값

        while (left <= right) {
            // 중간값 계산
            int mid = (left + right) / 2;

            if (mid == 0) {
                break;
            }

            // 중간값으로 조카에게 같은 길이의 막대과자를 줄 수 있는지 확인
            long cnt = 0;
            for (int len : arr) {
                cnt += len / mid;
            }

            if (cnt >= m) { // 조건 만족
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // 3. 출력
        System.out.println(result);
    }
}