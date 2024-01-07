import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        
        ArrayList<Integer> result = new ArrayList<>();
        result.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                result.add(arr[i]);
            }
        }

        answer = result.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}