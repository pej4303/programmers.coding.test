class Solution {
    public String solution(int[] food) {
        /*
        수웅이가 준비한 음식의 양을 칼로리가 적은 순서대로 나타내는 정수 배열 food가 주어졌을 때,
        대회를 위한 음식의 배치를 나타내는 문자열을 return 하는 solution 함수를 완성해주세요.
        */
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        for (int i=1; i<food.length; i++) {
            int mid = food[i] / 2;
            // System.out.println("mid = " + mid);
            sb.append( String.valueOf(i).repeat(mid) );
        }
        // System.out.println("sb = " + sb);
        
        String str = sb.toString();
        String reverseStr = sb.reverse().toString();
        
        //System.out.println("str = " + str);
        //System.out.println("reverseStr = " + reverseStr);
        
        answer = str + "0" + reverseStr;
        
        return answer;
    }
}