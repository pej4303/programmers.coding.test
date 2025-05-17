import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int result = 0;

        // 탐색
        for (int i=n-1; i>=0; i--) {
            // 배열의 값이 k보다 작거나 같으면
            if (arr[i] <= k) {
                // 몫을 result에 증가
                result += (k / arr[i]);
                k %= arr[i];
            }
        }

        System.out.println(result);
    }
}