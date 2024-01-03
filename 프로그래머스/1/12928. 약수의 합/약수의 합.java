import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        if ( 0 <= n && n <= 3000 ) {
            answer = IntStream.rangeClosed(1, n).filter(i -> n % i == 0).sum();
        }
        
        return answer;
    }
}