import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        // Arrays.stream(phone_book).sorted(); // => 정렬이 안됨
        Arrays.sort(phone_book);
        // System.out.println(Arrays.toString(phone_book));
        
        // 효율성 테스트에서 통과하지 못했음
        /*
        for (String phone : phone_book) {
            for (int i=0; i<phone_book.length; i++) {
                if ( !phone.equals(phone_book[i]) && phone.startsWith(phone_book[i]) ) {
                    answer = false;
                    break;
                }
            }
        }
        */
        for (int i=0; i<phone_book.length-1; i++) {
            // System.out.println(phone_book[i] + " / " + phone_book[i+1]);
            if ( phone_book[i+1].startsWith(phone_book[i]) ) {
                answer = false;
                break;
            }
        }
        
        return answer;
    }
}