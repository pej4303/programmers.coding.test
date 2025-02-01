import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 1) {
            return;
        }

        // 소인수분해
        for (int i=2; i<=Math.sqrt(n); i++) {
            while (n % i == 0) {
                System.out.println(i);
                n /= i;
            }
        }
        // 마지막 남은 소수가 있을 경우 출력
        // 예) 22 = 2 x 11 로 나와야 되어서 이렇게 추가함
        if (n > 1) {
            System.out.println(n);
        }
    }
}