class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String strK = String.valueOf(k);
        
        for (int n=i; n<=j; n++) {
            if ( String.valueOf(n).length() > 1) {
                for (String str : String.valueOf(n).split("")) {
                    if ( str.contains(strK) )  {
                        answer++;
                    } 
                }
            } else {
                if ( String.valueOf(n).contains(strK) )  {
                    answer++;
                }    
            }
        }
        
        return answer;
    }
}