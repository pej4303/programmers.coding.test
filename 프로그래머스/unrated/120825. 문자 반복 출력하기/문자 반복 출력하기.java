class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        
        if ( (2 <= my_string.length() && my_string.length() <= 5) && (2<= n && n <= 10) ) {
            StringBuffer sb = new StringBuffer();
            
            for ( String str : my_string.split("") ) {
                sb.append(str.repeat(n));
            }
            
            answer = sb.toString();
        }
        
        return answer;
    }
}