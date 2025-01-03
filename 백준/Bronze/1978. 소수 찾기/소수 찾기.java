import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int cnt = 0; //  소수 개수

        // 소수 : 1과 자기자신으로만 나눠지는 수
        for (int i=0; i<n; i++) {
            int tmp = sc.nextInt();

            for (int j=2; j<=tmp; j++) {
                if (j == tmp) {
                    cnt++;
                }
                
                if (tmp % j == 0) {
                    break;
                }
            }
        }

        System.out.println(cnt);
    }
}