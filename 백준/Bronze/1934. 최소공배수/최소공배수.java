import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // 테스트케이스
        for (int i=1; i<=t; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            int result = lcm(x,y);
            // 출력
            System.out.println(result);
        }
    }
    // 최소공배수
    private static int lcm(int a , int b) {
        return a * b / gcd(a, b);
    }
    // 최대공약수
    private static int gcd(int a, int b) {
        while (b != 0) {
            int tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }
}