import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        
        // 내림차순으로 정렬한 배열 복사
        Integer[] sortArr = Arrays.stream(emergency).boxed().toArray(Integer[]::new);
        Arrays.sort(sortArr, Collections.reverseOrder());
        // System.out.println(Arrays.toString(sortArr));
        
        // 정렬순서 찾아서 넣기
        for (int i=0; i<emergency.length; i++) {
            int index = getOrdIndex(emergency[i], sortArr);
            answer[i] = index + 1;
        }
        
        return answer;
    }
    
    public int getOrdIndex(int val, Integer[] sortArr) {
        for (int i=0; i<sortArr.length; i++) {
           if (val == sortArr[i]) {
                return i;
           }
        }
        
        return -1;
        
    }
}