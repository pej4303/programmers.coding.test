class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        /**
         * [제한사항]
         *  - my_string와 overwrite_string은 숫자와 알파벳으로 이루어져 있습니다.
         *  - 1 ≤ overwrite_string의 길이 ≤ my_string의 길이 ≤ 1,000
         *  - 0 ≤ s ≤ my_string의 길이 - overwrite_string의 길이
         */
        String answer = "";

        if (validate(my_string, overwrite_string, s)) {
//            String tmp = my_string.substring(s, overwrite_string.length() + s );
//            answer = my_string.replace(tmp, overwrite_string);
            int myStrLen = my_string.length();
            int overStrLen = overwrite_string.length();

            String tmp = my_string.substring(0, s);
            String tmp2 = my_string.substring(( s + overStrLen), myStrLen);

            answer += tmp + overwrite_string + tmp2;
        }

        System.out.println(answer);

        return answer;
    }

    public boolean validate(String my_string, String overwrite_string, int s) {
        boolean result = false;

        if ( 1<= overwrite_string.length() && overwrite_string.length() <= 1000) {
            result = true;
        }

        if ( 1<= my_string.length() && my_string.length() <= 1000) {
            result = true;
        }

        if ( 0 <= s && s <= (my_string.length() - overwrite_string.length()) ) {
            result = true;
        }

        return result;
    }
}