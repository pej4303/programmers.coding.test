import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int num1 = num_list[num_list.length - 1];
        int num2 = num_list[num_list.length - 2];
        
        int tmp = (num1 > num2) ? num1 - num2 : num1 * 2;
        
        // 원본 배열을 복사하여 새로운 배열을 생성
        int[] answer = Arrays.copyOf(num_list, num_list.length + 1);

        // 마지막 위치에 요소를 추가
        answer[num_list.length] = tmp;

        return answer;
    }
}