import java.math.BigInteger;
import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger x = sc.nextBigInteger(); // 영수증 총 금액
        int n = sc.nextInt();

        BigInteger sum = new BigInteger("0");
        for (int i=0; i<n; i++) {
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();

            sum = sum.add(a.multiply(b));
        }

        if (x.equals(sum)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}