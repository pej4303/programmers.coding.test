import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int cnt = 0;    // 사이클 횟수
        int tmp = -1;
        String strN = "";
        String[] arr = null;

        if (n < 10) {
            strN = "0" + n;
        } else {
            strN = String.valueOf(n);
        }

        while (true) {
            // 2 + 6 처럼 계산하기 위해서 나누기
            arr = String.valueOf(strN).split("");
            // 2+6 = 8 처럼 새로운 수 계산
            tmp = Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]);
//            System.out.println("tmp = " + tmp);

            // 사이클 증가
            cnt++;

            // 가장 오른쪽 자리 수와 앞에서 구한 합의 가장 오른쪽 자리 수를 연결
            strN = arr[1] + String.valueOf(tmp).substring(String.valueOf(tmp).length() -1);
//            System.out.println("strN = " + strN);

            if (n == Integer.parseInt(strN)) {
                break;
            }
        }

        // 출력
        System.out.println(cnt);
    }
}