import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        // 제한사항 : 1<= str 길이 <= 20
        if ( str.length() >= 1 && str.length() <= 20 ) {
            char[] charArray = str.toCharArray();

            for (int i = 0; i < charArray.length; i++) {
                char c = charArray[i];
                if (Character.isLowerCase(c)) {
                    charArray[i] = Character.toUpperCase(c);
                } else if (Character.isUpperCase(c)) {
                    charArray[i] = Character.toLowerCase(c);
                }
            }
            System.out.println(new String(charArray));
        }
    }
}