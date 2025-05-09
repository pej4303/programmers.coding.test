import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 배열 정렬
        Arrays.sort(arr);

        // 투 포인터 실행
        int result = 0;
        int startIdx = 0;
        int endIdx = n - 1;

        while (startIdx < endIdx) {
            int sum = arr[startIdx] + arr[endIdx];
            if (sum < m) {
                startIdx++;
            } else if (sum > m) {
                endIdx--;
            } else {
                result++;
                startIdx++;
                endIdx--;
            }
        }

        System.out.println(result);
    }
}
