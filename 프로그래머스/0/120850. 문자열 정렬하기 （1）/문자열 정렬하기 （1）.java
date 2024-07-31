import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};
        // 영문자 제거
        my_string = my_string.replaceAll("[a-zA-Z]", "");
        // 숫자로 변경
        answer = new int[my_string.length()];
        String[] strArr = my_string.split(""); 
        for (int i=0; i<strArr.length; i++) {
            answer[i] = Integer.parseInt(strArr[i]);
        }
        // 오름차순으로 정렬
        Arrays.sort(answer);
        
        return answer;
    }
}