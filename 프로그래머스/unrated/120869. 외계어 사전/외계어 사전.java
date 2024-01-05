class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2; 
        
        StringBuffer sb = new StringBuffer();
        for (String s : spell) {
            sb.append("(?=.*");
            sb.append(s);
            sb.append(")");
        }
        sb.append(".*");

        String regex = sb.toString();
       
        if (1 <= dic.length && dic.length <= 10 ) {
            for (String str : dic) {
                if ( str.matches(regex) ) {
                    answer = 1;
                    break;
                }
            }
        }
        
        return answer;
    }
}