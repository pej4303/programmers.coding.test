import java.io.*;
import java.util.*;
public class Main {
    static int n;
    static boolean[] visited;
    static int[] arr;       // 원본 배열
    static int[] tmpArr;    // 순열 배열

    static int max = Integer.MIN_VALUE;

    public static void main(String[] args) throws Exception {
        // 1. 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        visited = new boolean[n];
        arr = new int[n];
        tmpArr = new int[n];

        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 2. DFS를 이용해서 순열 만들기
        dfs(0);

        // 5. 출력
        System.out.println(max);
    }

    private static void dfs(int index) {
        if (index == n) {
            // System.out.println( Arrays.toString(tmpArr) );

            // 3. 완전탐색
            int sum = 0;
            for (int i=0; i<n-1; i++) {
                sum += Math.abs(tmpArr[i] - tmpArr[i+1]);
            }
            // 4. 최대값 계산
            max = Math.max(max, sum);

            return;
        }

        for (int i=0; i<n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                tmpArr[index] = arr[i];
                dfs(index + 1);
                // 한 번 선택한 숫자를 다시 되돌려 놓고 다음에 또 다른 숫자를 선택해보는 구조 → 백트레킹
                visited[i] = false;
            }
        }
    }
}