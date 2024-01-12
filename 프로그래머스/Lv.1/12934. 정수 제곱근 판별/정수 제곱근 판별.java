class Solution {
    public long solution(long n) {
        long answer = 0;
        
        // 제곱근 확인
        int sqrt = (int) (Math.sqrt(n));
        
        if ( Math.pow(sqrt, 2) == n) {
            answer = (long) Math.pow(sqrt + 1, 2);
        } else {
            answer = -1;
        }
        
        return answer;
    }
}