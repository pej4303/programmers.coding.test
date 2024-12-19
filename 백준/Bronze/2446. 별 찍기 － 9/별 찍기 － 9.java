import java.util.*;

public class Main {
    public static void main(String[] args) {
        String star = "*";
        String space = " ";
        int repeatCnt = 0;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 역삼각형 출력
        for (int i=n; i>=1; i--) {
            repeatCnt = 2 * i - 1;
            System.out.println(space.repeat(n - i) + star.repeat(repeatCnt));
        }

        // 삼각형 출력
        for (int i=2; i<=n; i++) {
            repeatCnt = 2 * i - 1;
            System.out.println(space.repeat(n - i) + star.repeat(repeatCnt));
        }
    }
}
