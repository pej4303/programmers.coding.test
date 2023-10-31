import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();

        StringBuffer sb = new StringBuffer();
        if (validate(str, n)) {
            for (int i=0; i < n; i++) {
                sb.append(str);
            }
            System.out.println(sb.toString());
        }

    }

    public static boolean validate(String str, int n) {
        boolean result = false;
        if ( str.length() >= 1 && str.length() <= 10 ) {
            result = true;
        }

        if ( n >= 1 && n <= 10 ) {
            result = true;
        }

        return result;
    }
}