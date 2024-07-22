import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        
        if (arr.length == 1) {
             answer = new int[] {-1};
        } else {
            // 배열에서 최소값 찾기
            int min = arr[0];
            for (int i = 1; i < arr.length; i++) {
                min = Math.min(min, arr[i]);
            }
            
            // 최소값을 제외한 새로운 배열 생성
            answer = new int[arr.length - 1];
            int index = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != min) {
                    answer[index++] = arr[i];
                }
            }
            
        }
        
        return answer;
    }
}