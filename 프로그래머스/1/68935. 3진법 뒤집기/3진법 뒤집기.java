class Solution {
    public int solution(int n) {
        int answer = 0;
        StringBuffer sb = new StringBuffer();
        
        if (n < 3) {
            return n;
        }
        
        /*
        int tmp = n;
        // 3진법으로 변환
        while (true) {
            sb.append(tmp % 3);
            tmp = tmp / 3;
            if ( tmp < 3) {
                sb.append(tmp);
                break;
            }
        }

        String[] strArr = sb.toString().split("");
        // 3진법 -> 10진법으로 변환
        for (int i=0; i<strArr.length; i++) {
            if ( Integer.parseInt(strArr[i]) > 0 ) {
                double pow = Math.pow(3, (strArr.length-1 - i));
                answer += (Integer.parseInt(strArr[i]) * pow);
            }
        }
        */
        // 2024.06.23 : 다른 방법
        
        // 1. 3진법으로 변환
        String str = Integer.toString(n, 3);
        // System.out.println(str);
        // 2. 뒤집기
        String tmp = new StringBuilder(str).reverse().toString();
        // 3. 10진법으로 변환
        answer = Integer.valueOf(tmp, 3);
        
        return answer;
    }
}