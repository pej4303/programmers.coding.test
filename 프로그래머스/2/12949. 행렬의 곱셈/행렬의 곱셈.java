class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        /*
        arr1의 크기: n x m
        arr2의 크기: m x p
        결과 행렬의 크기: n x p
        */
        
        int n = arr1.length;            // arr1의 행 개수
        int m = arr1[0].length;         // arr1의 열 개수 (== arr2의 행 개수)
        int p = arr2[0].length;         // arr2의 열 개수

        // 결과 행렬의 크기: n x p
        int[][] answer = new int[n][p];

        // 행렬 곱 수행
        for (int i=0; i<n; i++) {    
            for (int j=0; j<p; j++) {      
                for (int k=0; k<m; k++) { 
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        return answer;
    }
}
