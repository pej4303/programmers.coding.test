import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum1 = 0;
        for (int i=0; i<4; i++ ) {
            int tmp1 = sc.nextInt();
            sum1 += tmp1;
        }
        int sum2 = 0;
        for (int i=0; i<4; i++ ) {
            int tmp2 = sc.nextInt();
            sum2 += tmp2;
        }

        int result = 0;
        if (sum1 == sum2) {
            result = sum1;
        } else {
            result = Math.max(sum1, sum2);
        }

        System.out.println(result);
    }
}