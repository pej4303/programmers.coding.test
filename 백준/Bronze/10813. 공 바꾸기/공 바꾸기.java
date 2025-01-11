import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();    // 바구니 개수
        int m = sc.nextInt();    // 공 바꿀 횟수

        int[] arr = new int[n+1];  // 바구니 배열

        // 초기값 셋팅
        for (int i=1; i<=n; i++) {
            arr[i] = i;
        }

        int tmp = 0;
        for (int t=1; t<=m; t++) {
            int i = sc.nextInt();
            int j = sc.nextInt();

            // i와 j가 같은수라면 공 바꿀 필요가 없음
            // i와 j가 서로 다를때만 변경하도록
            if (i != j) {
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }

        // 출력
        for (int i=1; i<=n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}