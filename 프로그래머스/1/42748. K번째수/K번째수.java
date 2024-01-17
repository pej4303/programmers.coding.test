import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        int[] tmp = {};
        int[] tmpArr = {};
        List<Integer> list = new ArrayList<>();

        for (int i=0; i<commands.length; i++) {
            tmp = commands[i];
            // 배열 자르기
            tmpArr = Arrays.copyOfRange(array, tmp[0]-1, tmp[1]);
            // 정렬하기
            Arrays.sort(tmpArr);
            // 배열의  k번째 값 담기
            list.add(tmpArr[tmp[2]-1]);
        }

        answer = list.stream().mapToInt(Integer::intValue).toArray();

        
        return answer;
    }
}