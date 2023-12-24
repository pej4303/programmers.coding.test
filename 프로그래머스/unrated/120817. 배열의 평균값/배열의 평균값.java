import java.util.*; 
import java.util.stream.*; 

class Solution {
    public double solution(int[] numbers) {
        double answer = Arrays.stream(numbers).average().getAsDouble();
        
        return answer;
    }
}