import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = {};
       
        // int[] -> Integer[]로 변환
        Integer[] tmpArr = Arrays.stream(numlist).boxed().toArray(Integer[]::new);
        
        Arrays.sort(tmpArr, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                int diffNum1 = Math.abs(a - n);
                int diffNum2 = Math.abs(b - n);
                
                if (diffNum1 != diffNum2) {
                    return diffNum1 - diffNum2;
                } else {
                    // 절대값이 같으면 더 큰 수가 앞으로 오도록
                    return b - a;    
                }
            }
        });
        
        // System.out.println(Arrays.toString(tmpArr));
        
        // Integer[] -> int[]로 변환
        answer = Arrays.stream(tmpArr).mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}