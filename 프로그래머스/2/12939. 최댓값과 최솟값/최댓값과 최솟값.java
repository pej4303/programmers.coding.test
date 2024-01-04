import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        int min = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).summaryStatistics().getMin();
        int max = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).summaryStatistics().getMax();
        
        answer = min + " " + max;
        
        return answer;
    }
}