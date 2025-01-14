import java.math.BigInteger;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // 테스트케이스

        int a = 0;
        int b = 0;


        for (int i=0; i<t; i++) {
            a = sc.nextInt();
            b = sc.nextInt();

            // 방법1) 메모리 초과는 안 나지만 7^100 % 10 결과값이 이상하게 나옴
//            result = (int) (Math.pow(a, b) % 10);
            // 방법2) BigInteger 이용하면 메모리 초과 발생
            // 방법3)
            int result = 1;
            for (int j=0; j<b; j++) {
                // 1의 자리만 구하기 위해서
                result = (result * a) % 10;
            }

            if (result == 0) {
                result = 10;
            }

            System.out.println(result);
        }

        sc.close();
    }
}