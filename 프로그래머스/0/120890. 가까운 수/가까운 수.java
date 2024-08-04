import java.util.*;
class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        
        // 유효성 검사
        if ( 1 > n || n > 100) {
            return answer;
        }
        
        for (int i=0; i<array.length; i++) {
            if (1 > array[i] || array[i] > 100 ) {
                return answer;
            }
        }
        
        int diffMin = Math.abs(n - array[0]);
        int min = array[0];
        for (int i=1; i<array.length; i++) {
            //diffMin = Math.min(diffMin, Math.abs(n - array[i]));
            //min = array[i];
            
            int currentDiff = Math.abs(n - array[i]);
            if (currentDiff < diffMin) {
                diffMin = currentDiff;
                min = array[i];
            } else if (currentDiff == diffMin) {
                // 차이가 같은 경우 더 작은 수를 선택
                if (array[i] < min) {
                    min = array[i];
                }
            }
        }
        
        // System.out.println(diffMin);
        
        answer = min;
        
        return answer;
    }
}