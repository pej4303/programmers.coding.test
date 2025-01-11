import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // 바구니 개수
        int m = sc.nextInt();   // 공 바꿀 횟수

        int[] arr = new int[n+1];  // 바구니 배열

        // 초기값 셋팅
        for (int i=1; i<=n; i++) {
            arr[i] = i;
        }

        int tmp = 0;
        for (int t=1; t<=m; t++) {
            // i번째 부터 j번째까지의 순서를 역순으로
            int i = sc.nextInt();
            int j = sc.nextInt();

            // i와 j가 같은수라면 순서를 변경할 필요가 없음
            // i와 j가 서로 다를때만 변경하도록
            if (i != j) {
                int index = i;
                int index2 = j;
                // while문을 쓰는것이 더 정확하게 뒤집을수 있음
                while (index < index2) {
                    tmp = arr[index];
                    arr[index] = arr[index2];
                    arr[index2] = tmp;

                    index++;
                    index2--;
                }
                /*
                for (int index=i; index<=j; index++) {
                    tmp = arr[index];
                    arr[index] = arr[index2];
                    arr[index2] = tmp;

                    index2--;

                    if (index == index2) {
                        break;
                    }
                }
                */
            }

//            System.out.println( Arrays.toString(arr) );
        }

        // 출력
        for (int i=1; i<=n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}