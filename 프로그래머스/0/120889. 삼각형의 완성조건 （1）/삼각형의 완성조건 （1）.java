// import java.util.*;
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        // 원소 유효성 검사
        for (int i=0; i<sides.length; i++) {
            if ( 1 > sides[i] || 1000 < sides[i] ) {
                return answer;
            }
        }
        
        // 최대값 구하기
        int max = sides[0];
        for (int i=1; i<sides.length; i++) {
            max = Math.max(max, sides[i]);
        }
        
        int sum = 0;
        for (int i=0; i<sides.length; i++) {
            sum += sides[i];
        }
        
        /*
        int sum = Arrays.stream(sides).filter(i -> i != max).sum();
        System.out.println(sum);
        */
        System.out.println(sum - max);
        answer = ( (sum - max) > max ) ? 1 : 2;
        
        return answer;
    }
}