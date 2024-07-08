import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
        // 방법1)
        /*
        int answer = 3;
        
        if ( 3 <= n && n <= 1_000_000 ) {
           // answer = IntStream.rangeClosed(3, n).filter(i -> n % i == 1).summaryStatistics().getMin();
        }
        */
     
        
        // 방법2) 효율성 테스트에서 걸려서 변경함
        return IntStream.rangeClosed(2, n).filter(i -> n % i == 1).summaryStatistics().getMin();    
    }
}