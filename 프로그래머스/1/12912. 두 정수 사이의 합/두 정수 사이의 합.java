import java.util.stream.*;
class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        
        if (a < b) {
            answer = IntStream.rangeClosed(a, b).summaryStatistics().getSum();
        } else {
            answer = IntStream.rangeClosed(b, a).summaryStatistics().getSum();
        }
        
        return answer;
    }
}