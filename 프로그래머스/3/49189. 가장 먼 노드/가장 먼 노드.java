import java.util.*;
class Solution {
    static boolean[] visited = null;
    static List<List<Integer>> list = null;
    
    static int maxDist = 0;   // 최대 거리
    static int[] dist = null; // 노드들의 거리를 가진 배열
    
    public int solution(int n, int[][] edge) {
        int answer = 0;
        
        // 인접리스트 만들기
        list = new ArrayList<>();
        for (int i=0; i<= n; i++) {
            list.add(new ArrayList<>());
        }
        
        for (int i=0; i<edge.length; i++) {
            int a = edge[i][0];
            int b = edge[i][1];

            list.get(a).add(b);
            // 간선은 양방향이며
            list.get(b).add(a);
        }
        
        // 방문배열 만들기
        visited = new boolean[n+1];
        
        // 거리 배열 만들기
        dist = new int[n + 1];
        dist[1] = 0;
        
        // 탐색
        bfs(1, n);
        
        // 가장 먼 노드들 계산
        for (int d : dist) {
            if (d == maxDist) {
                answer++;
            }
        }
        
        return answer;
    }
    
     private void bfs(int start, int n) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        
        visited[start] = true;
        
        while (!queue.isEmpty()) {
            int node = queue.poll();
            for (int i : list.get(node)) {
                if (!visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                    
                    dist[i] = dist[node] + 1;
                    maxDist = Math.max(maxDist, dist[i]);
                }
            }
        }
    }
}