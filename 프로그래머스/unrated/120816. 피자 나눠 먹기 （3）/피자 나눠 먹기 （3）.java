class Solution {
    public int solution(int slice, int n) {
        int answer = 1;
        // 유효성 검사
        boolean vaildateSlice = (2 <= slice) && (slice <= 10);
        boolean vaildateN = (1 <= n) && (n <= 100);
        
        // 인원당 필요한 피자 조각수
        int pizzaCnt = answer * n;

        answer = (pizzaCnt + slice - 1) / slice;
        
        return answer;
    }
}