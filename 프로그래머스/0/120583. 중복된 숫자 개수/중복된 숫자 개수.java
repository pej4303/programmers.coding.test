import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        long answer = Arrays.stream(array).filter(i -> i == n).count();
        
        return (int) answer;
    }
}