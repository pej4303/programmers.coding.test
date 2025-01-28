import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] arr = new double[n];

        for (int i=0; i<n; i++) {
            arr[i] = sc.nextDouble();
        }

        // 최댓값 찾기
        double max = Arrays.stream(arr).max().getAsDouble();

        // 계산
        for (int i=0; i<n; i++) {
            // 정확하게 계산되지 않으므로 double형으로 변경
            arr[i] = arr[i] / max * 100;
        }

        // 출력
        double result = Arrays.stream(arr).average().getAsDouble();
        System.out.println(result);
    }
}