import java.io.*;
import java.util.*;

public class Main {
    static int[][] arr = null;          // 인접행렬
    static boolean[] visited = null;    // 방문배열
    static int n = 0;                   // 노드의 수

    static int result = 0;

    public static void main(String[] args) throws IOException {
        // 1. 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());    // 컴퓨터의 수 = 노드의 수
        int m = Integer.parseInt(br.readLine());    // 네트워크 상에서 직접 연결되어 있는 컴퓨터 쌍의 수 = 간선의 수

        // 2. 인접행렬 만들기
        arr = new int[n+1][n+1];
        StringTokenizer st = null;
        for (int i=1; i<=m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            arr[a][b] = 1;
            // "연결된 쌍"이라는 표현만 있고 방향성 언급 없음 -> 양방향
            // 양방향인가 싶어서 추가함
            arr[b][a] = 1;
        }

        // 3. 방문배열 만들기
        visited = new boolean[n+1];

        // 4. 탐색
        bfs(1);

        // 5. 출력
        System.out.println(result -1);
    }

    private static void bfs(int index) {
        visited[index] = true;

        Queue<Integer> queue = new LinkedList<>();
        queue.add(index);

        while (!queue.isEmpty()) {
            int node = queue.poll();
//            System.out.print(node + " ");
            result++;
            // 간선 수와는 관계 없이 인접행렬에서는 노드의 개수를 다 확인해야 한다.
            for (int i=1; i<=n; i++) {
                if (arr[node][i] == 1 && !visited[i] ) {
                    visited[i] = true;
                    // 다음에 방문할 대상으로 큐에 넣는다.
                    queue.add(i);
                }
            }
        }
    }
}