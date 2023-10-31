import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
        int answer = 0;

        if ( n % 2 == 0) {
            // 짝수
            answer = IntStream.rangeClosed(0, n).filter(i -> i % 2 == 0).map(x -> x * x).sum();
        } else {
            // 홀수
            answer = IntStream.rangeClosed(0, n).filter(i -> i % 2 != 0).sum();
        }

        return answer;
    }
}