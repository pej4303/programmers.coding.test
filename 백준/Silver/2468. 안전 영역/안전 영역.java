import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static boolean[][] visited = null;
    // 방향 벡터 (상, 하, 좌, 우)
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static int n = 0;
    static int[][] arr = null;

    public static void main(String[] args) throws Exception {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        StringTokenizer st = null;
        arr = new int[n][n];
        int maxHeight = 0;
        int minHeight = 101;

        // 2차원배열 생성
        for (int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                maxHeight = Math.max(maxHeight, arr[i][j]);
                minHeight = Math.min(minHeight, arr[i][j]);
            }
        }

        int maxCnt = 1;
        for (int h=minHeight; h<=maxHeight; h++) {
            visited = new boolean[n][n];
            int cnt = 0;

            for (int x=0; x<n; x++) {
                for (int y=0; y<n; y++) {
                    if (arr[x][y] > h && !visited[x][y]) {
                        dfs(x, y, h);
                        cnt++;
                    }
                }
            }

            maxCnt = Math.max(maxCnt, cnt);
        }

        // 출력
        System.out.println(maxCnt);
    }

    public static void dfs(int x, int y , int h) {
        visited[x][y] = true;

        for (int i=0; i<4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && nx < n && ny >= 0 && ny < n) {
                if (!visited[nx][ny] && arr[nx][ny] > h) {
                    dfs(nx, ny, h);
                }
            }
        }
    }
}