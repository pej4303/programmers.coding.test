import java.util.*;
class Solution {
    static boolean[] visited = null;
    
    public int solution(int n, int[][] computers) {
        int answer = 0;
        
        // 방문 배열 만들기
        visited = new boolean[n];
        
        for (int i=0; i<n; i++) {
            if (!visited[i]) {
                bfs(i, computers, visited, n);
                answer++;
            }
        }
        
        return answer;
    }
    
    private void bfs(int start, int[][] computers, boolean[] visited, int n) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int node = queue.poll();

            for (int i=0; i<n; i++) {
                if (computers[node][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }
    
}