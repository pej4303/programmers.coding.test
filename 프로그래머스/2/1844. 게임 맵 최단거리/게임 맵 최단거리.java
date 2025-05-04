import java.util.*;

class Solution {
    static boolean[][] visited = null;
    
    static int n = 0;
    static int m = 0;
    
    // 왼쪽,오른쪽,아래,위
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    
    public int solution(int[][] maps) {
        int answer = 0;
        
        // 최대한 빨리 => BFS
        // 미로 => 4방향 체크
        
        n = maps.length; // 가로
        m = maps[0].length; // 세로
        
        // 방문배열 만들기
        visited = new boolean[n][m];
        
        // 탐색
        bfs(0,0, maps);
        
        // 출력 : 지나가야 하는 칸의 개수의 최솟값
        answer = maps[n - 1][m - 1];
        
        return answer == 1 ? -1 : answer;  // 도착 못했으면 -1
    }
    
    private void bfs(int start, int end, int[][] maps) {
        // System.out.println();
        
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {start, end});
        
        visited[start][end] = true;
        
        while ( !queue.isEmpty() ) {
            int[] nowPos = queue.poll();
            int nowX = nowPos[0];
            int nowY = nowPos[1];
            
            // 4방향 체크
            for (int i=0; i<4; i++) {
                int nx = nowX + dx[i];
                int ny = nowY + dy[i];
                
                // 범위 체크
                if (nx < 0 || ny < 0 || nx >= n || ny >= m) {
                    continue;
                }
                
                // 방문 여부 + 이동 가능한 칸인지 확인
                if (maps[nx][ny] == 1 && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    queue.add(new int[]{nx, ny});
                    
                    // 이전 칸에서 1 더한 값으로 거리 갱신 => 최소 칸 수를 구하는 핵심
                    maps[nx][ny] = maps[nowX][nowY] + 1;
                }
            }
        }
        
    }
}