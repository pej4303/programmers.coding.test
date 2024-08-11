import java.util.*;
class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = {};
        
        List<String> list = new ArrayList<>();
        int i = 0;
        while (i < my_str.length()) {
            int end = Math.min(i + n, my_str.length());
            list.add(my_str.substring(i, end));
            i += n;
        }
        
        for (String str : list) {
            System.out.println(str);
        }
        
        answer = list.toArray(new String[0]);
        
        return answer;
    }
}