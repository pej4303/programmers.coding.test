import java.util.stream.IntStream;

class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        Long cnt = 0L;
        for (int i=left; i<=right; i++) {
            int tmp = i;
            // 약수의 개수를 구하기
            cnt = IntStream.rangeClosed(1, tmp).filter(num -> tmp % num == 0).count();

            if ( cnt % 2 == 0) {
                answer += tmp;
            } else {
                answer -= tmp;
            }
        }
        
        return answer;
    }
}