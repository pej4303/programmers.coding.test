import java.util.*;

class Solution {
    public int[] solution(String[][] places) {
        int[] answer = new int[places.length];

        // 각 대기실에 대해 검사
        for (int i = 0; i < places.length; i++) {
            if (checkPlace(places[i])) {
                answer[i] = 1;  // 거리두기 지킴
            } else {
                answer[i] = 0;  // 거리두기 위반
            }
        }

        return answer;
    }

    // 대기실 하나에 대해 거리두기 준수 여부를 체크하는 메서드
    private boolean checkPlace(String[] place) {
        for (int x = 0; x < 5; x++) {
            for (int y = 0; y < 5; y++) {
                if (place[x].charAt(y) == 'P') {
                    // 사람(P) 위치에서 BFS를 실행해 거리두기 여부를 검사
                    if (!bfs(x, y, place)) {
                        return false;
                    }
                }
            }
        }
        return true;  // 모든 사람의 위치에서 검사 통과 시 true 반환
    }

    // BFS를 통해 거리두기 규칙을 준수하는지 확인하는 메서드
    private boolean bfs(int x, int y, String[] place) {
        int[] dx = { -1, 1, 0, 0 };
        int[] dy = { 0, 0, -1, 1 };
        boolean[][] visited = new boolean[5][5];  // 방문 체크 배열

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] { x, y, 0 });  // 초기 위치와 거리(0) 삽입
        visited[x][y] = true;

        while (!queue.isEmpty()) {
            int[] pos = queue.poll();
            int cx = pos[0], cy = pos[1], dist = pos[2];

            // 거리 2를 초과하면 더 이상 검사할 필요 없음
            if (dist >= 2) {
                continue;
            }

            // 상하좌우 인접한 위치 탐색
            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                // 범위 체크 및 방문 여부 확인
                if (nx < 0 || ny < 0 || nx >= 5 || ny >= 5 || visited[nx][ny]) {
                    continue;
                }

                visited[nx][ny] = true;  // 방문 처리

                // 사람(P)이 있는 경우 거리두기 위반
                if (place[nx].charAt(ny) == 'P') {
                    return false;
                }

                // 빈 테이블(O)인 경우만 계속 탐색
                if (place[nx].charAt(ny) == 'O') {
                    queue.offer(new int[] { nx, ny, dist + 1 });
                }
            }
        }
        return true;  // 거리두기 규칙을 모두 지킨 경우
    }
}
