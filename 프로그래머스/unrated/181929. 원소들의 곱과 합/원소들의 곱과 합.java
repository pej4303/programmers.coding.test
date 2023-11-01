import java.util.stream.IntStream;

class Solution {
    public int solution(int[] num_list) {
        int num = IntStream.of(num_list).reduce(1, (x, y) -> x * y);
        int num2 = IntStream.of(num_list).sum() * IntStream.of(num_list).sum();

        return num < num2 ? 1 : 0;
        
    }
}