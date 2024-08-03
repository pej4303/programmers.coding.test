class Solution {
    public int solution(int order) {
        int answer = 0;
        
        if ( 1 <= order && order <= 1_000_000) {
            String str = String.valueOf(order);
            String[] strArr = str.split("");

            for (int i=0; i<strArr.length; i++) {
                if ( Integer.parseInt(strArr[i]) % 3 == 0
                     && Integer.parseInt(strArr[i]) != 0) {
                    answer++;
                }
            }    
        }
           
        return answer;
    }
}