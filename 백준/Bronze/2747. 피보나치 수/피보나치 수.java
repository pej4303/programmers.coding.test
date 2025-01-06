import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int pre1 = 0;   // 이이전값
        int pre2 = 1;   // 이전값
        int result = 0; // 결과값

        if (n == 0) {
            System.out.println(0);
        } else if (n == 1){
            System.out.println(1);
        } else {
            int i = 1;
            while (i<n) {
                result = pre1 + pre2; // 피보나치 수의 합
                pre1 = pre2;
                pre2 = result;

                i++;
            }

            // 출력
            System.out.println(result);
        }
    }
}