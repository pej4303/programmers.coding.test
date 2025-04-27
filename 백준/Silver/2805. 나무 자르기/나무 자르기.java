import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 1. 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 나무의 수
        int n = Integer.parseInt(st.nextToken());
        // 나무의 길이
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        int high = 0;
        int low = 0;

        st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            high = Math.max(high, arr[i]);
        }

        // 2. 이분 탐색
        int result = 0;

        while (high >= low) {
            int mid = (high + low) / 2;
            long sum = 0;

            // 현재 높이(mid)로 잘랐을 때 얻는 나무 길이 합 구하기
            for (int num : arr) {
                if (num > mid) {
                    sum += (num - mid);
                }
            }

            if (sum >= m) {
                result = mid;       // 조건을 만족했으니 일단 기록
                low = mid + 1;      // 절단기 높이를 더 높여본다
            } else {
                high = mid - 1;     // 절단기 높이를 낮춰야 함
            }
        }

        System.out.println(result);
    }
}