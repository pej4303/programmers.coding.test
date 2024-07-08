import java.util.*;

class Solution {
    public int solution(String s) {
        StringBuilder sb = new StringBuilder();
        
        Map<String, String> map = new HashMap<>();
        map.put("zero", "0");
        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");
        map.put("four", "4");
        map.put("five", "5");
        map.put("six", "6");
        map.put("seven", "7");
        map.put("eight", "8");
        map.put("nine", "9");
        
        if (1 <= s.length() && s.length() <= 50) {
            int i = 0;
            while (i < s.length()) {
                if (Character.isDigit(s.charAt(i))) { // 숫자인 경우
                    sb.append(s.charAt(i));
                    i++;
                } else {
                    for (String key : map.keySet()) { // 문자인 경우
                        if (s.startsWith(key, i)) {
                            sb.append(map.get(key));
                            i += key.length();
                            break;
                        }
                    }
                }
            }
        }
        
        return Integer.parseInt(sb.toString());
    }
}
