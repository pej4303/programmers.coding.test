import java.util.*;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        Arrays.sort(sides);
        
        int a = sides[0];
        int b = sides[1];
        int c = 0;
        int max = sides[0] + sides[1];
        int min = sides[0];
        
        for (int i=1; i<max; i++) {
        // for (int i=min; i<max; i++) {
            c = i;
            /*
              a + b > c
              b + c > a
              c + a > b
            */
            
            boolean con1 = a + b > c;
            boolean con2 = b + c > a;
            boolean con3 = c + a > b;
            
            if ( con1 && con2 && con3) {
                answer++;   
            }
        }
        
        return answer;
    }
}