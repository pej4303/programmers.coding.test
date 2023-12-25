class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        
        int oddCnt = 0;
        int evenCnt = 0;
        
        for (int i : num_list) {
            if ( i % 2 == 0) {
                evenCnt++;
            } else {
                oddCnt++;
            }
        }
        
        answer = new int[]{evenCnt, oddCnt};
        
        return answer;
    }
}