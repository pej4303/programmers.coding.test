import java.io.*;
import java.util.*;
public class Main {
    static int[][] arr = null;
    static boolean[] visited = null;
    static int n = 0;
    static int result = -1;

    public static void main(String[] args) throws IOException {
        // 1. 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 사람의 수
        n = Integer.parseInt(br.readLine());
        //
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        // 관계의 개수
        int m = Integer.parseInt(br.readLine());

        // 2. 인접행렬 만들기
        arr = new int[n+1][n+1]; // 정점의 개수만큼 만들어야 함
        for (int i=0; i<m; i++) {
            st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            arr[x][y] = 1;
            arr[y][x] = 1;
        }

        // 3. 방문배열 만들기
        visited = new boolean[n+1];

        // 4. 탐색
        dfs(a,b,0);

        // 5. 출력
        System.out.println(result);
    }

    private static void dfs(int a, int b, int cnt) {
        // 방문처리
        visited[a] = true;

        // 찾던 사람에 도달했는지 체크
        if (a == b) {
            result = cnt;
            return;
        }

        // 재귀
        for (int i=1; i<=n; i++) {
            if (arr[a][i] == 1 && !visited[i]) {
                dfs(i, b, cnt+1);
            }
        }
    }
}