import java.util.*;
class Solution {
    public int[] solution(int n) {
        int[] answer = new int[n*(n+1) / 2]; // 배열의 절반만 채워짐
		
        int[][] arr = new int[n][n];
        int x = -1; // 가로
        int y = 0; // 세로
        int d = 0; // 초기값
		
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				if (i % 3 == 0) { // 대각선 아래
					x++;
				} else if (i % 3 == 1) { // 가로
					y++;
				} else if (i % 3 == 2) { // 대각선 위
					x--;
					y--;
				}
				arr[x][y] = ++d;
			}
		}
		
		 // 배열 변환
        int index = 0;
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if (arr[i][j] != 0 ) {
                    answer[index] = arr[i][j]; // 값 복사
                    index++;
                }
            }
        }

        
        return answer;
    }
}