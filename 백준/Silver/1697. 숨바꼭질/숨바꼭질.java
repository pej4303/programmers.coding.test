import java.io.*;
import java.util.*;
public class Main {
    static boolean[] visited;
    static int result = 0;
    static int n = 0;
    static int k = 0;

    public static void main(String[] args) throws Exception {
        // 1. 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());   // 수빈 위치
        k = Integer.parseInt(st.nextToken());   // 동생 위치

        // 2. 방문배열 만들기
        visited = new boolean[100001];

        // 3. bfs 처리
        bfs(n, k);

        // 4. 출력
        System.out.println(result);
    }

    private static void bfs(int start, int end) {
        // 1. 큐 생성
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{start, 0});

        // 2. 방문배열 표시
        visited[start] = true;

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int pos = cur[0];
            int cnt = cur[1];

            // 동생을 찾았음
            if (pos == end) {
                result = cnt;
                return;
            }

            // 지금 위치에서 갈 수 있는 3가지 위치를 탐색하면서 아직 안 가본 곳이면 큐에 넣는다.
            // 시간도 +1 해준다.
            int[] moveArr = {pos - 1, pos + 1, pos * 2};
            for (int move : moveArr) {
                if ((0 <= move && move <= 100000) && !visited[move]) {
                    visited[move] = true;
                    queue.add(new int[]{move, cnt + 1});
                }
            }

        }
    }
}