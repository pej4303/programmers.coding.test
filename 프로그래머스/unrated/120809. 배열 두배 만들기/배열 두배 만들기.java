import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        
        answer = IntStream.of(numbers).map(num -> num * 2).toArray();
        
        return answer;
    }
}