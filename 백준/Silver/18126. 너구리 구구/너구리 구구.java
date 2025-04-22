import java.io.*;
import java.util.*;

public class Main {
    static ArrayList<ArrayList<Node>> list;  // 인접 리스트
    static boolean[] visited;                // 방문 배열
    static int n;
    static long maxDist = 0;                 // 최장 거리 저장용 변수

    // Node 클래스 정의
    static class Node {
        int to;
        int dist;
        public Node(int to, int dist) {
            this.to = to;
            this.dist = dist;
        }
    }

    public static void main(String[] args) throws IOException {
        // 1. 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        // 2. 인접리스트 만들기
        list = new ArrayList<>();
        for (int i=0; i<=n; i++) {
            list.add(new ArrayList<>());
        }

        for (int i=0; i<n-1; i++) {
            String[] tmp = br.readLine().split(" ");
            int a = Integer.parseInt(tmp[0]);
            int b = Integer.parseInt(tmp[1]);
            int c = Integer.parseInt(tmp[2]);

            // A번 방과 B번 방 사이를 양방향으로 연결하는 길의 길이가 C임을 의미한다.
            list.get(a).add(new Node(b, c));
            list.get(b).add(new Node(a, c));
        }

        // 3. 방문배열 만들기
        visited = new boolean[n + 1];

        // 4. 탐색
        visited[1] = true;
        dfs(1, 0);

        // 5. 출력
        System.out.println(maxDist);
    }

    private static void dfs(int now, long dist) {
        // 최대 거리 갱신
        if (maxDist < dist) {
            maxDist = dist;
        }

        // 인접 노드 탐색
        for (Node node : list.get(now)) {
            if (!visited[node.to]) {
                visited[node.to] = true;
                dfs(node.to, dist + node.dist);
            }
        }
    }
}