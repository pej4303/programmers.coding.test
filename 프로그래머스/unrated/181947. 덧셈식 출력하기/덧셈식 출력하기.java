import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        // 제한사항 : 1 ≤ a, b ≤ 100
        if ( 1<= a && b <= 100) {
            System.out.println(String.format("%d + %d = %d", a, b, (a + b)));
        }
    }
}