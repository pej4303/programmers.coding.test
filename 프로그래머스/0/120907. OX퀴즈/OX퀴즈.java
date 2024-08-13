import java.util.*;

class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = {};
        
        String[] arr = {};
        String[] calArr = {};
        int tmpCalc = 0;
        List<String> list = new ArrayList<>();
        
        for (String str : quiz) {
            // System.out.println(str);
            arr = str.split("=");
            // 수식 부분만 가져오게
            calArr = arr[0].split(" ");
            
            tmpCalc = Integer.parseInt(calArr[0]);
            for (int i=1; i <calArr.length; i++) {
               // System.out.println(calArr[i]);
               if ( i % 2 != 0 ) {
                   if (calArr[i].equals("+")) { 
                       tmpCalc += Integer.parseInt(calArr[i+1]);
                   } else {
                       tmpCalc -= Integer.parseInt(calArr[i+1]);
                   }
               }
            }
            // System.out.println( Integer.parseInt(arr[1].trim()) );
            // 수식 계산값이랑 배열의 결과값을 비교
            if (Integer.parseInt(arr[1].trim()) == tmpCalc) {
                list.add("O");
            } else {
                list.add("X");
            }
            
            // 수식 계산값 초기화
            tmpCalc = 0;
        }
        
        // 리스트 -> 배열로 변환
        answer = list.toArray(new String[0]);
        
        return answer;
    }
}