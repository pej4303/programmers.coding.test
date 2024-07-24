class Solution {
    public int[][] solution(int[] num_list, int n) {
        int m = num_list.length / n;  // 행의 크기
        
        // 2차원 배열 선언
        int[][] answer = new int[m][n];
        
        int index = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (index < num_list.length) {
                    answer[i][j] = num_list[index];
                    index++;
                }
            }
        }
        
        return answer;
    }
}
