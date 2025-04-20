import java.io.*;
import java.util.*;
public class Main {
    static int[][] arr = null;          // 인접 배열
    static boolean[] visited = null;  // 방문 배열

    static int n = 0;

    public static void main(String[] args) throws IOException {
        StringTokenizer st = null;
        /**
         * 1. 입력
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        // 정점의 개수
        n = Integer.parseInt(st.nextToken());
        // 간선의 개수
        int m = Integer.parseInt(st.nextToken());
        // 정점의 번호
        int v = Integer.parseInt(st.nextToken());

        /**
         * Q. 인접 배열(인접 행렬)을 왜 만드는 거지?
         * A. 그래프를 탐색하려면 '연결 정보'를 어떻게 저장할까? 라는 본질로 연결된다.
         *    정점과 정점 사이가 연결되어 있는지 빠르게 확인하기 위해서이다.
         */

        /**
         * 2. 정점의 개수를 기준으로 인접행렬 만들기
         *    - 인접행렬은 정점들 간의 연결을 저장한다.
         *       → 누가 누구랑 연결되어 있는지를 2차원으로 표현 (예: graph[a][b] == 1) 한다.
         */
        arr = new int[n + 1][n + 1];
        for (int i=1; i<=m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            arr[a][b] = 1;
            // 양방향이니까 반대 방향도 연결되었다는 표시 추가한다.
            arr[b][a] = 1;
        }

        //
        /**
         * 3. 방문 배열 만들기
         *    - 방문 배열은 정점 하나가 방문됐는지 여부만 저장한다.
         *      → 각 정점이 방문됐는지 안됐는지만 체크하면 되니까 1차원이면 된다.
         */
        visited = new boolean[n + 1];

        /***
         * 4. DFS/BFS 탐색 함수 호출
         */
        dfs(v);
        System.out.println();

        // 방문 배열 초기화 후 BFS
        visited = new boolean[n + 1];
        bfs(v);

    }

    /**
     * DFS
     * @param v
     */
    private static void dfs(int v) {
        visited[v] = true;
        System.out.print(v + " ");

        for (int i=1; i<=n; i++) {
            if (arr[v][i] == 1 && !visited[i]) {
                dfs(i);
            }
        }
    }

    private static void bfs(int v) {
        visited[v] = true;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(v);

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");

            /**
             * Q. for문을 사용하는 이유는?
             * A. BFS에서의 for문은 현재 노드의 모든 이웃 노드 탐색용이다.
             *    큐는 어떤 노드를 꺼내서 방문 처리하는 순서를 관리하고
             *    for문은 꺼낸 노드와 연결된 이웃들을 확인하는 역할이다.
             */
            for (int i=1; i<=n; i++) {
                if (arr[node][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }
}