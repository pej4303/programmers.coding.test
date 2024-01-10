import java.util.stream.*;

class Solution {
    public int[] solution(long n) {
        int[] answer = {};
        
        StringBuffer sb = new StringBuffer();
        for (String str : String.valueOf(n).split("")) {
            sb.append(str);
        }

        answer = Stream.of(String.valueOf(sb.reverse()).split("")).mapToInt(Integer::parseInt).toArray();
        
        
        return answer;
    }
}