import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int gcdNum = gcd(x, y);  // 최대공약수
        int lcnNum = lcm(x, y);  // 최소공배수

        // 출력
        System.out.println(gcdNum);
        System.out.println(lcnNum);
    }
    // 최대공약수
    public static int gcd(int a , int b) {
        // 나머지가 0이 되면 그때의 나누는 수가 최대공약수이다.
        while ( b != 0 ) {
            int temp = b;
            // 나머지가 생기면 작은 수와 나머지를 이용해 다시 나눈다.
            b = a % b;
            a = temp;
//            System.out.println("a = " + a);
//            System.out.println("b = " + b);
        }

        return a;
    }
    // 최소공배수
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}