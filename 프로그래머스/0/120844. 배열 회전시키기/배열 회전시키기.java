import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        int startIndex = 0;
        int copyIndex = 0;
        int[] answer = new int[numbers.length];
        
        if ( "right".equals(direction) ) {
            startIndex = 1;
            copyIndex = 0;
            
            answer[0] = numbers[numbers.length-1];
        } else {
            startIndex = 0;
            copyIndex = 1;
            
            answer[numbers.length-1] = numbers[0];
        }
        
        // right => 원본 배열의 마지막이 맨 앞으로
        // left => 원본 배열의 첫번째가 맨 뒤로
        
        /*
        Object src  : 복사할 객체, 원본 배열
        int srcPos : 복사 시작할 index
        Object dest : 복사된 배열
        int destPos : 원본으로부터 가져온 데이터를 복사된 배열의 몇 번째부터 추가할지
        int length : 카피되는 배열 요소 개수
        */
        
        // 원본 배열을 복사해서 특정위치에 넣기
        System.arraycopy(numbers, copyIndex, answer, startIndex, numbers.length-1);
        // System.out.println("answer = " + Arrays.toString(answer));
        
        return answer;
    }
}