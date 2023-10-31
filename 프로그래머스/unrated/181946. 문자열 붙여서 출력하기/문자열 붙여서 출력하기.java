import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        // 제한사항 : 1 ≤ str1, str2의 길이 ≤ 10
        if ( (1<= str1.length() && str1.length() <= 10) && (1<= str2.length() && str2.length() <= 10) ) {
            System.out.println(str1.concat(str2));
        }
    }
}