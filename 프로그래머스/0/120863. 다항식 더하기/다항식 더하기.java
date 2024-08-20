class Solution {
    public String solution(String polynomial) {
        int numX = 0; // x의 합
        int constant = 0; // 상수의 합
        
        String[] arr = polynomial.split(" ");
        for (String str : arr) {
            // +는 건너뛰기
            if (str.contains("+")) {
                continue;
            }
            if (str.contains("x")) { // "x"가 포함된 경우
                if (str.length() > 1) { // "x" 앞에 숫자가 있는 경우
                    String tmpNum = str.replace("x", "");
                    numX += Integer.parseInt(tmpNum);
                } else {
                    numX += 1; // "x"만 있는 경우
                }
            } else {
                constant += Integer.parseInt(str); // 상수 항을 더함
            }
        }
        
        StringBuilder sb = new StringBuilder();
        if (numX > 0) {
            sb.append(numX == 1 ? "x" : numX + "x");
        }
        if (constant > 0) {
            if (sb.length() > 0) {
                sb.append(" + ");
            }
            sb.append(constant);
        }
        
        return sb.toString();
    }
}
