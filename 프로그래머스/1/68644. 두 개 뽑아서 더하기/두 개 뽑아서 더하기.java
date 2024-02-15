import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        
        Arrays.sort(numbers);
        
        List<Integer> list = new ArrayList<>();
        
        for (int i=0; i<numbers.length; i++) {
            for (int j=i+1; j<numbers.length; j++) {
                // System.out.println(numbers[i] + " + " + numbers[j]);
                list.add(numbers[i] + numbers[j]);
            }
        }
        
        answer = list.stream().distinct().sorted().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
    /*
    0 2 5 7
    0 + 2 = 2
    0 + 5 = 5
    0 + 7 = 7
    2 + 5 = 7
    2 + 7 = 9
    5 + 7 = 12
    */
}