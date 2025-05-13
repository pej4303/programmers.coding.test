import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        int max = 0;
        int min = 0;
        int result = 0;
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max, arr[i]); // 가장 큰 예산 요청
        }
        // 총 예산
        int m = Integer.parseInt(br.readLine()); 
        
        // 이분 탐색 시작
        while (min <= max) {
            int mid = (min + max) / 2;
            long sum = 0;

            for (int num : arr) {
                if (num <= mid) {
                    // 요청 금액 그대로 배정
                    sum += num;
                } else {
                    // 상한 금액으로 배정
                    sum += mid;
                }
            }

            if (sum <= m) {
                result = mid; // 가능한 상한액 후보
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }

        System.out.println(result);
    }
}