class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int len = p.length();
        
        String tmp = "";
        for (int i=0; i<=t.length() - len; i++) {
            // 추출하려는 마지막 인덱스보다 1 큰 값을 사용해야함.
            tmp = t.substring(i, i + len); 
            // System.out.println(tmp);
            
            if ( Long.parseLong(p) >=  Long.parseLong(tmp) ) {
                answer++;
            }
        }
        
        return answer;
    }
}