import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        String str = IntStream.of(num_list).filter(i -> i % 2 != 0).mapToObj(String::valueOf).collect(Collectors.joining());
        String str2 = IntStream.of(num_list).filter(i -> i % 2 == 0).mapToObj(String::valueOf).collect(Collectors.joining());
        
        answer = Integer.valueOf(str) + Integer.valueOf(str2);
        
        return answer;
    }
}