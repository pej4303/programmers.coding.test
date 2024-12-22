import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        // 바구니
        int[] arr = new int[n];

        // 2번째줄
        for (int index=0; index<m; index++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();

            for (int index2=i-1; index2<j; index2++) {
                arr[index2] = k;
            }
        }

        Arrays.stream(arr).forEach(i -> System.out.print(i + " "));
    }
}