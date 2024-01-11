import java.util.*;
import java.util.stream.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        // long -> int[] 배열로 변경
        int[] tmp = Stream.of(String.valueOf(n).split("")).mapToInt(Integer::parseInt).sorted().toArray();
        System.out.println("tmp = " + Arrays.toString(tmp));

        // 배열 역순으로 변경
        int[] reverseArr = new int[tmp.length];
        for (int i = 0; i<tmp.length; i++) {
            reverseArr[i] = tmp[tmp.length - 1 - i];
        }
        
        String str = Arrays.toString(reverseArr).replaceAll("[^0-9]", "");
        
        // int[] -> long으로 변경
        answer = Long.parseLong(str);
        
        return answer;
    }
}