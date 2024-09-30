class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int len = board.length;

        // 8방향을 나타내는 배열
        int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};

        // 지뢰 찾기
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (board[i][j] == 1) {
                    // System.out.println("좌표 = (" + i + "," + j + ")");

                    // 지뢰 인접 칸들을 "2"로 변경
                    for (int d = 0; d < 8; d++) {
                        int nx = i + dx[d];
                        int ny = j + dy[d];

                        // 인접 칸이 범위를 벗어나지 않으면 "2"로 변경
                        if (nx >= 0 && ny >= 0 && nx < len && ny < len && board[nx][ny] == 0) {
                            board[nx][ny] = 2;
                        }
                    }
                }
            }
        }

        // 안전한 지역의 칸 수 계산
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (board[i][j] == 0) {
                    answer++;
                }
            }
        }

        return answer;
    }
}
