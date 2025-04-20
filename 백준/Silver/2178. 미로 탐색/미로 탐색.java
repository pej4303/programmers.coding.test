import java.io.*;
import java.util.*;

public class Main {
    static int[][] arr = null;           //
    static boolean[][] visited = null;    // 방문배열(해당 2차원 배열에 방문했다는 의미)

    static int n = 0;
    static int m = 0;
    static int result = 0;

    // 상하좌우 이동 좌표
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        // 경로 최소 칸의수 => BFS 이용

        StringTokenizer st = null;

        // 1. 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        // 2. 배열 만들기
        // => 인접행렬이 아니라 직접 2차원 배열을 순회하는 방식을 해야된다.
        // 2차원 배열 순회 => 격자형 구조(미로, 지도 등)에서 탐색시 사용한다.
        arr = new int[n][m];
        for (int i=0; i<n; i++) {
            String[] tmpArr = br.readLine().split("");
            for (int j=0; j<m; j++) {
                arr[i][j] = Integer.parseInt(tmpArr[j]);
            }
        }

        // 3. 방문배열 만들기
        visited = new boolean[n][m];

        // 4. 탐색
        bfs(0, 0);

        // 5. 출력
        System.out.println(arr[n - 1][m - 1]); // 목표 위치 (n-1, m-1) 출력
    }
    private static void bfs(int x, int y) {
        visited[x][y] = true;

        // 2차원 배열시 이렇게 사용한다.
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});

        while (!queue.isEmpty()) {
            int[] nowPos = queue.poll();
            int posX = nowPos[0];
            int posY = nowPos[1];

            // 상하좌우(4방향) 확인
            for (int i=0; i<4; i++) {
                int nx = posX + dx[i];
                int ny = posY + dy[i];

                // 범위 체크
                if (nx < 0 || ny < 0 || nx >= n || ny >= m) {
                    continue;
                }

                // 방문 여부 + 이동 가능한 칸인지 확인
                if (arr[nx][ny] == 1 && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    // 이전 칸에서 1 더한 값으로 거리 갱신 => 최소 칸 수를 구하는 핵심
                    arr[nx][ny] = arr[posX][posY] + 1;
                    queue.add(new int[]{nx, ny});
                }
            }
        }
    }
}