import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String strN = String.valueOf(n);
        
        for (String str : strN.split("")) {
            answer += Integer.parseInt(str);
        }
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println(answer);

        return answer;
    }
}