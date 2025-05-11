import java.io.*;
import java.util.*;

public class Main {
    static int[][] arr;
    static boolean[] visited;
    static int n = 0;
    static int result = 0;

    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 정점의 개수
        n = Integer.parseInt(st.nextToken());
        // 간선의 개수
        int m = Integer.parseInt(st.nextToken());

        // 2. 인접행렬 만들기
        arr = new int[n+1][n+1];
        for (int i=1; i<=m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            arr[a][b] = 1;
            arr[b][a] = 1;
        }

        // 3. 방문배열 만들기
        visited = new boolean[n+1];

        // 4. 탐색
        for (int i=1; i<=n; i++) {
            if (!visited[i]) {
                dfs(i);
                result++; // 연결 요소 개수 증가
            }
        }

        // 5. 출력
        System.out.println(result);
    }

    private static void dfs(int node) {
        visited[node] = true;

        for (int i=1; i<=n; i++) {
            if (arr[node][i] == 1 && !visited[i]) {
                dfs(i);
            }
        }
    }
}