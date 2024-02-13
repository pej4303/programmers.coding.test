import java.util.*;
import java.util.stream.IntStream;

class Solution {
    public int solution(int[] numbers) {
        int answer = -1;
        
        int sum = IntStream.rangeClosed(0, 9).sum();
        int numbersSum = Arrays.stream(numbers).sum();
        
        answer = sum - numbersSum;
        
        return answer;
    }
}