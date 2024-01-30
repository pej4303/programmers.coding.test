import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        int maxCnt = nums.length / 2;
        int[] tmp = Arrays.stream(nums).distinct().toArray();

        if (maxCnt < tmp.length) {
            answer = maxCnt;
        } else {
            answer = tmp.length;
        }
        
        return answer;
    }
}