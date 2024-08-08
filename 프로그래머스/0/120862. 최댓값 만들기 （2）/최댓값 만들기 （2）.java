import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = -100000000;
        
        // 유효성 검사 검증
        if ( 2 > numbers.length || numbers.length > 100 ) {
            return answer;
        }
        for (int num : numbers) {
            if ( -10000 > num || num > 10000 ) {
                return answer;
            }
        }
        // System.out.println("유효성 검사 끝");
        for (int i=0; i<numbers.length; i++) {
			for (int j=numbers.length-1; j>i; j--) {
				/* if (answer < numbers[i] * numbers[j]) {
					answer = numbers[i] * numbers[j];
				} */
                
                answer = Math.max(numbers[i] * numbers[j], answer);
			} 
		}
        
        return answer;
    }
}