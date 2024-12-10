import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long num1 = sc.nextLong(); // 통장 1
        long num2 = sc.nextLong(); // 통장 2
        long price = sc.nextLong(); // 치킨 가격

        long sum = num1 + num2; // 통장 합

        // 계산 및 출력
        if (sum >= 2L * price) { // 2 * price와 비교
            System.out.println(sum - (2L * price));
        } else {
            System.out.println(sum);
        }
    }
}