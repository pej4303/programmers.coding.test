import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        
        HashMap<String, Integer> map = new HashMap<>();
        
        // 카테고리별로 담기게 구현
        for (int i = 0; i < clothes.length; i++) {
            // System.out.println("clothes: " + clothes[i][1]);
            if ( map.containsKey(clothes[i][1]) ) {
                int value = map.get(clothes[i][1]);
                map.put(clothes[i][1], value + 1);
            } else {
                map.put(clothes[i][1], 1);
            }
        }
        
        for (String key : map.keySet()) {
            // System.out.println("Key: " + key + ", Value: " + map.get(key));
            answer *= (map.get(key) + 1);
        }
        
        answer -= 1;

        return answer;
    }
}