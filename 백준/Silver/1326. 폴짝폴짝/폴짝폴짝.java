import java.io.*;
import java.util.*;

public class Main {
    static int[] arr;
    static int result = -1;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        arr = new int[n+1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=1; i<n+1; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());   // 출발지
        int end = Integer.parseInt(st.nextToken());     // 도착지

        // 방문배열 만들기
        visited = new boolean[n+1];

        bfs(n, start, end);

        System.out.println(result);
    }

    private static void bfs(int n, int start, int end) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{start, 0});

        visited[start] = true;

        while(!q.isEmpty()){
            int[] cur = q.poll();

            int pos = cur[0];
            int cnt = cur[1];
            
            if (pos == end) {
                result = cnt;
                return;
            }

            int jump = arr[pos];

            // 오른쪽으로 이동
            for (int i = pos; i < n+1; i+=jump) {
                if(!visited[i]){
                    visited[i] = true;
                    q.add(new int[]{i, cnt+1});
                }
            }
            // 왼쪽으로 이동
            for (int i = pos; i > 0; i-=jump) {
                if(!visited[i]){
                    visited[i] = true;
                    q.add(new int[]{i, cnt+1});
                }
            }
        }
    }
}