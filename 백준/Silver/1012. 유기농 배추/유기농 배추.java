import java.io.*;
import java.util.*;

public class Main {
    static int[][] arr = null;
    static boolean[][] visited = null;
    static int result = 0;

    static int m = 0;
    static int n = 0;

    // 상하좌우 이동
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        String[] tmpArr = null;

        // 1. 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 테스트케이스
        int t = Integer.parseInt(br.readLine());

        for (int index=0; index<t; index++) {
            tmpArr = br.readLine().split(" ");
            // 배추밭의 가로길이 M
            m = Integer.parseInt(tmpArr[0]);
            // 배추밭의 세로길이 N
            n = Integer.parseInt(tmpArr[1]);
            // 배추가 심어져 있는 위치의 개수 K
            int k = Integer.parseInt(tmpArr[2]);

            // 2. 인접행렬 만들기
            arr = new int[m][n];

            for (int i=0; i<k; i++) {
                tmpArr = br.readLine().split(" ");
                int a = Integer.parseInt(tmpArr[0]);
                int b = Integer.parseInt(tmpArr[1]);

//                System.out.println(a + " / " + b);

                arr[a][b] = 1;
            }

            // 3. 방문배열 만들기
            visited = new boolean[m][n];

            result = 0;

            // 4. 탐색
            for (int i=0; i<m; i++) {
                for (int j=0; j<n; j++) {
                    if (arr[i][j] == 1 && !visited[i][j]) {
                        bfs(i, j);
                        result++;
                    }
                }
            }

            // 5. 출력
            System.out.println(result);
        }
    }

    static void bfs (int x, int y) {
        visited[x][y] = true;

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {x, y});

        while(!queue.isEmpty()) {
            int[] node = queue.poll();

            int nowX = node[0];
            int nowY = node[1];

            // 미로 형식
            for (int i=0; i<4; i++) {
                int nx = nowX + dx[i];
                int ny = nowY + dy[i];

                if (nx >= 0 && ny >= 0 && nx < m && ny < n) {
                    if (arr[nx][ny] == 1 && !visited[nx][ny]) {
                        queue.add(new int[] {nx, ny});
                        visited[nx][ny] = true;
                    }
                }
            }
        }
    }
}