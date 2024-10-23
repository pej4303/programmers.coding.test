import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        // String -> list로 변환
        ArrayList<String> list = new ArrayList<>();
        for (String str : s.split("")) {
            list.add(str);
        }
        
        // list 정렬
        list.sort(Comparator.reverseOrder());
        //System.out.println("내림차순 : " + list); //  [g, f, e, d, c, b, Z]
        
        // list -> String 으로 변환
        answer = String.join("", list);
        //System.out.println("answer : " + answer); //  gfedcbZ
        
        return answer;
    }
}