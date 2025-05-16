import java.io.*;
import java.util.*;
public class Main {
    static int n = 0;
    static int s = 0;
    static int result = 0;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 정수의 개수
        n = Integer.parseInt(st.nextToken());
        // 정수 S
        s = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 탐색
        dfs(0, 0);

        // s가 0일 경우 아무것도 선택하지 않은 경우가 포함되어 result가 1 더해졌으므로 빼줌
        if (s == 0) {
            result--;
        }

        // 출력
        System.out.println(result);
    }


    private static void dfs(int index, int total) {
        // 현재 누적합이 s와 같다면 result 증가
        if (total == s) {
            result++;
        }

        // 부분수열 구성
        for (int i=index; i<n; i++) {
            dfs(i + 1, total + arr[i]);
        }
    }
}