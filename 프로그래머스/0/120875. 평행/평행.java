class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
       
        // 기울기를 이용해서 평행한지 확인
        // (y2 - y1) / (x2 - x1);
        
        // case dots[0], dots[1] / dots[2], dots[3]
        double slope1 = (double) (dots[1][1] - dots[0][1]) / (dots[1][0] - dots[0][0]);
        double slope2 = (double) (dots[3][1] - dots[2][1]) / (dots[3][0] - dots[2][0]);
        if (slope1 == slope2) {
            answer = 1;
        }
        
        // case dots[0], dots[2] / dots[1], dots[3] 
        slope1 = (double) (dots[2][1] - dots[0][1]) / (dots[2][0] - dots[0][0]);
        slope2 = (double) (dots[1][1] - dots[3][1]) / (dots[1][0] - dots[3][0]);
        if (slope1 == slope2) {
            answer = 1;
        }
        
        // case dots[0], dots[3] / dots[1], dots[2]
        slope1 = (double) (dots[3][1] - dots[0][1]) / (dots[3][0] - dots[0][0]);
        slope2 = (double) (dots[1][1] - dots[2][1]) / (dots[1][0] - dots[2][0]);
        if (slope1 == slope2) {
            answer = 1;
        }
        
        return answer;
       
    }
}