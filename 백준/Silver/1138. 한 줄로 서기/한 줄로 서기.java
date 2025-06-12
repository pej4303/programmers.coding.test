import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 사람의 수
        int n = Integer.parseInt(br.readLine());
        // 배열
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[n];
        for (int i=0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] result = new int[n];
        for (int i=0; i<n; i++) {
            int pepoleCnt = arr[i]; // 왼쪽에 있어야 할 사람 수
            int cnt = 0;

            for (int j=0; j<n; j++) {
                // 빈 칸이면 키 큰 사람 수를 셀 수 있음
                if (result[j] == 0) {
                    if (cnt == pepoleCnt) {
                        result[j] = i + 1; // 사람 번호는 i+1
                        break;
                    }
                    cnt++;
                }
            }
        }

        Arrays.stream(result).forEach(i -> System.out.print(String.format("%d ", i)) );
    }
}