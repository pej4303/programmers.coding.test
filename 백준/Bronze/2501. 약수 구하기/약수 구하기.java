import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt(); // 몇번째 작은수

        int[] arr = new int[n+1];
        // 약수 찾기
        for (int i=1; i<=n; i++) {
            if (n % i == 0) {
                arr[i] = i;
            }
        }

        // 배열에서 0 제거
        int[] result = Arrays.stream(arr).filter(item -> item != 0).toArray();

        // 배열 정렬
        Arrays.sort(result);

        if (result.length < k) {
            System.out.println(0);
        } else {
            System.out.println(result[k -1]);
        }
    }
}