class Solution {
    public int solution(int[][] triangle) {
        int answer = 0;
        
        // 아래에서 위로 올라가면서 계산하면 쉬움
        for (int i=triangle.length - 2; i >= 0; i--) {
            for (int j=0; j<= i; j++) {
                triangle[i][j] += Math.max(triangle[i+1][j], triangle[i+1][j+1]);
                // System.out.println("sum =" + triangle[i][j] );
                
            }
        }
        
        return triangle[0][0];
    }
}