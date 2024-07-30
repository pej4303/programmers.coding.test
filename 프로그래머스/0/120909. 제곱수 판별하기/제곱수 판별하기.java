class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int num = (int) Math.sqrt(n);
        
        if ( Math.pow(num, 2) == n) {
            answer = 1;
        } else {
            answer = 2;
        }
        
        return answer;
    }
}