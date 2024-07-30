import java.util.*;
class Solution {
    public int solution(int[] array, int height) {
        long answer = Arrays.stream(array).filter(i -> i > height).count();
        
        return (int) answer;
    }
}