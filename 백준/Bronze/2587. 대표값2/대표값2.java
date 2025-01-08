import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[5];

        // 입력
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<5; i++) {
            arr[i] = sc.nextInt();
        }

        // 평균값 구하기
        int sum = 0;
        for (int i=0; i<5; i++) {
            sum += arr[i];
        }

        int avg = (int) sum / 5;
        System.out.println(avg);

        // 중앙값 구하기

        // 배열 정렬
        Arrays.sort(arr);

        int center = 5 / 2;

        System.out.println(arr[center]);
    }
}