class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        char[] arr = s.toCharArray();
        boolean isUpper = true;

        for (int i=0; i<arr.length; i++) {
            if (arr[i] == ' ') {
                sb.append(arr[i]);
                isUpper = true;
            } else {
                if ( isUpper ) {
                    // 대문자로 변환
                    sb.append(Character.toUpperCase(arr[i]));
                } else {
                    // 소문자로 변환
                    sb.append(Character.toLowerCase(arr[i]));
                }
                isUpper = false;
            }
        }

        return sb.toString();
    }
}