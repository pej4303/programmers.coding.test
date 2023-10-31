class Solution {
    public int solution(int a, int b, boolean flag) {
        int answer = 0;
        
        if ( (-1000 <= a && a <= 1000) && (-1000 <= b && b <= 1000) ) {
            answer = flag ? a + b : a - b;
        }
        
        return answer;
    }
}