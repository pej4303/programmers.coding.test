class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int len = common.length;
        
        /*if ( common[0] * common[1] == common[2] ) {
            // 등비수열
            // System.out.println("등비");
            answer = common[len-1] * common[0];
        } else {
            // 등차수열
            //System.out.println("등차");
            answer = common[len-1] + common[0];
        }*/
        
        // 공차와 공비를 먼저 구하고 하면 테스트에 통과함
        int a = common[1]-common[0]; // 공차
        int b = 0; // 공비
        
        if (common[0] != 0) {
             b = common[1] / common[0];
        } 

        if (a + common[1] == common[2]) {
            // 등차
            answer = common[len-1] + a;
        } else {
            // 등비
            answer = common[len-1] * b;
        }
        
        return answer;
    }
}