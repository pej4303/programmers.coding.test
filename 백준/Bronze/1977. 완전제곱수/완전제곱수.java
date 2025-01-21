import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        long sum = 0;
        int min = Integer.MAX_VALUE;
        boolean isFlag = false;

        for (int i=n; i<=m; i++) {
            // 완전제곱수인지 판별
            isFlag = false;
            for (int j=1; j<=i; j++) {
                if (j * j == i) {
                    isFlag = true;  // 완전제곱수
                    min = Math.min(min, i);
                    sum += i;
                    break;
                }
            }
        }

        // 출력
        if (sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}