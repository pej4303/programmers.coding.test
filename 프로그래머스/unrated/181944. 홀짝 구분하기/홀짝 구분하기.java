import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 제한사항 : 1 ≤ n ≤ 1,000
        if ( 1<= n && n <= 1000) {
            if ( n % 2 == 0) {
                System.out.println(String.format("%d is even", n));
            } else {
                System.out.println(String.format("%d is odd", n));
            }
        }
    }
}