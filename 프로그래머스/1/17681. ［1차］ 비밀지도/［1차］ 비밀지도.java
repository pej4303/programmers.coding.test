class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        /*
        0. 문자열 연산을 많이 해야 하니 StringBuilder 사용
        1. arr1, arr2를 순회
         - 각 항목을 이진수로 변환 - Integer.toBinaryString
         - 각 항목에 '1'이 하나라도 있으면 '#', 둘다 '0'이면 공백으로 표시
        3. answer 반환
        */
        
        StringBuilder sb = new StringBuilder();
        
        for (int i=0; i<arr1.length; i++) {
            String tmpNum1 = String.format("%" + n + "s", Integer.toBinaryString(arr1[i])).replace(' ', '0');
            String tmpNum2 = String.format("%" + n + "s", Integer.toBinaryString(arr2[i])).replace(' ', '0');
            // System.out.println( tmpNum );
            
            char[] c1 = tmpNum1.toCharArray();
            char[] c2 = tmpNum2.toCharArray();
            
            // System.out.println( createStr(c1, c2) );
            answer[i] = createStr(c1, c2);
            
        }
        
        return answer;
    }
    
    private String createStr(char[] c1, char[] c2) {
        StringBuilder sb = new StringBuilder();
        
        for (int i=0; i<c1.length; i++) {
            if ( c1[i] == '0' && c2[i] == '0' ) {
                sb.append(" ");
            } else {
                sb.append("#");
            }
        }
        
        return sb.toString();
    }
  
}