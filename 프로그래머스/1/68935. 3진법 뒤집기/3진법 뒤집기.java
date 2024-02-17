class Solution {
    public int solution(int n) {
        int answer = 0;
        
        if (n < 3) {
            return n;
        }
        
        StringBuffer sb = new StringBuffer();
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
        
        return answer;
    }
}