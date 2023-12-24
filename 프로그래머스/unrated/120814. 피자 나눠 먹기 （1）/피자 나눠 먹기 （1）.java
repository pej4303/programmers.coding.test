class Solution {
    public int solution(int n) {
        int answer = 0;
        
        if ( 1<= n && n <= 100) {
            for (int i=0; i<= n; i++) {
                if ( i % 7 == 1) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}