import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        // 버튼 시간 정의
        int a = 300; // 5분
        int b = 60;  // 1분
        int c = 10;  // 10초

        // T가 10의 배수가 아니면 계산 불가
        if (t % 10 != 0) {
            System.out.println(-1);
        } else {
            int countA = t / a;
            t %= a;

            int countB = t / b;
            t %= b;

            int countC = t / c;

            System.out.println(countA + " " + countB + " " + countC);
        }
    }
}