import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static int[][] arr;
    static boolean[][] visited;

    static List<Integer> list = new ArrayList<>();

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws Exception {
        // 1. 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        arr = new int[n][n];
        visited = new boolean[n][n];

        for (int i=0; i<n; i++) {
            String line = br.readLine();
            for (int j=0; j<n; j++) {
                arr[i][j] = line.charAt(j) - '0';
            }
        }

        // 2. 전체를 탐색하면서 BFS 실행
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if (arr[i][j] == 1 && !visited[i][j]) {
                    int result = bfs(i, j);
                    list.add(result);
                }
            }
        }

        // 3. 오름차순으로 정렬
        list.sort(null);

        // 4. 출력
        System.out.println(list.size());
        list.stream().forEach(System.out::println);
    }

    private static int bfs(int x, int y) {
        int cnt = 1;

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x, y});

        visited[x][y] = true;

        while (!queue.isEmpty()) {
            int[] nowPos = queue.poll();
            int posX = nowPos[0];
            int posY = nowPos[1];

            for (int i=0; i<4; i++) {
                int nx = posX + dx[i];
                int ny = posY + dy[i];

                // 범위 체크
                if (nx < 0 || ny < 0 || nx >= n || ny >= n) {
                    continue;
                }

                if (arr[nx][ny] == 1 && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    cnt++;
                    queue.add(new int[]{nx, ny});
                }
            }
        }

        return cnt;
    }
}
