class Solution {
    public String solution(String rsp) {
        /*
        가위는 2 
        바위는 0 
        보는 5
        */
        // 문제 : rsp에 저장된 가위 바위 보를 모두 이기는 경우를 순서대로 나타낸 문자열을 return
        StringBuilder sb = new StringBuilder();
        for (char ch : rsp.toCharArray()) {
            switch (ch) {
                case '2' :
                    sb.append('0');
                    break;
                case '0' :
                    sb.append('5');
                    break;
                case '5' :
                    sb.append('2');
                    break;
            }
        }
        
        return sb.toString();
    }
}