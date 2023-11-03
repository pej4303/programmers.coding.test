class Solution {
    public String solution(int[] numLog) {
        StringBuffer answer = new StringBuffer();
        int tmp = 0;
        
        for (int i=0; i<numLog.length; i++) {
            if ( i == numLog.length -1) {
                break;
            }
            
            tmp = numLog[i+1] - numLog[i];
            
            switch (tmp) {
                case 1:
                    answer.append("w");
                    break;
                case -1:
                    answer.append("s");
                    break;
                case 10:
                    answer.append("d");
                    break;
                case -10:
                    answer.append("a");
                    break;
            }
        }
        
        return answer.toString();
    }
}