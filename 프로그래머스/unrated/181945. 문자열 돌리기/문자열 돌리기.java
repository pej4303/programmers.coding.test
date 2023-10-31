import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        // 제한사항 : 1 ≤ str의 길이 ≤ 10
        if ( 1<= str.length() && str.length() <= 10 ) {
            // abcde
            for ( Character c : str.toCharArray() ) {
                System.out.println(c.toString());
            }
        }
    }
}