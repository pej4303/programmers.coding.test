class Solution {
    public String solution(String s) {
        String answer = "";
        
        
        StringBuilder sb = new StringBuilder();
        
        /*
        boolean isUpper = false; 
        for (char c : s.toCharArray()) {
            if (!Character.isAlphabetic(c)) {
                sb.append(c);
                isUpper = true;
            } else {
               if (isUpper) {
                    sb.append(Character.toUpperCase(c));
                } else {
                    sb.append(Character.toLowerCase(c));
                }
                isUpper = !isUpper;
            }
        }
        */
        // 정확성 테스트를 통과하지 못했음
        String[] strArr = s.split(" ", -1);
        for (int i=0; i<strArr.length; i++) {
            String str = strArr[i];
            for (int j=0; j<str.length(); j++) {
                if (j % 2 == 0) {
                    sb.append(Character.toUpperCase(str.charAt(j)));
                } else {
                    sb.append(Character.toLowerCase(str.charAt(j)));
                }
            }
            if (i < strArr.length - 1) {
                sb.append(" ");
            }
        }
        
        answer = sb.toString();
        
        return answer;
    }
}