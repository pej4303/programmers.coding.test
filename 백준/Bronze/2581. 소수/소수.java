import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int sum = 0; // 소수의 합
        int min = 0; // 소수의 최솟값

        // 소수 : 1과 자기 자신으로만 나눠지는 수
        for (int i=m; i<=n; i++) {
            if (i < 2) { // 2보다 작은 수는 소수가 아님
                continue;
            }

            boolean isPrime = true; // 소수인지 판별

            // 소수 판별
            for (int j=2; j * j <=i; j++) {
                // 1과 자기 자신이외의 수로 나누어 떨어지면 소수가 아님
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                sum += i;

                if (min == 0 || min > i) {
                    min = i;
                }
            }
        }

        if (sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
