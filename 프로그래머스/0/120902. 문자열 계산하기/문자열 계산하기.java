/*class Solution {
    public int solution(String my_string) {
        int answer = 0;
        boolean isFlag = false;
        char operator = '+';

        // 유효성 검사
        if (my_string.length() < 5 || my_string.length() > 100) {
            return answer;
        }

        for (char c : my_string.toCharArray()) {
            if (c == ' ') { 
                continue;
            } else if (c == '+' || c == '-') {
                operator = c;
                isFlag = true;
            } else if (Character.isDigit(c)) {
                int num = Character.getNumericValue(c);
                if (isFlag) {
                    if (operator == '+') {
                        answer += num;
                    } else if (operator == '-') {
                        answer -= num;
                    }
                    isFlag = false;
                } else {
                    answer = num;
                }
            }
            // System.out.println(answer);
        }
        return answer;
    }
}*/
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] res = my_string.split(" ");
        answer = Integer.parseInt(res[0]); // 첫번째 값 저장.
        
        for (int i = 1; i < res.length; i++) {
            if (i%2!=0) {
                if (res[i].equals("+")) { 
                    answer += Integer.parseInt(res[i+1]);
                } else {
                    answer -= Integer.parseInt(res[i+1]);
                }    
           }
        }

        return answer;
    }
}
