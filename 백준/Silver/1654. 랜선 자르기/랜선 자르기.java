import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 랜선의 개수
        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int[] arr = new int[k];

        long min = 1;      // 랜선 길이는 최소 1부터 가능
        long max = 0;
        long result = 0;

        for (int i=0; i<k; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            max = Math.max(max, arr[i]);
        }

        // 배열 정렬
        Arrays.sort(arr);

        // 이분 탐색
        while (min <= max) {
            // 중간값 구하기
            long mid = (min + max) / 2;
            long cnt = 0;

            for (int num : arr) {
                cnt += (num / mid);
            }

            if (cnt < n) {
                max = mid - 1;   // 더 짧은 길이 시도
            } else {
                result = mid;      // 가능한 길이 저장
                min = mid + 1;    // 더 긴 길이 가능할지 확인
            }
        }

        System.out.println(result);
    }
}