import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // 카드의 개수
        int m = sc.nextInt();

        int[] numArr = new int[n];
        for (int i=0; i<n; i++) {
            numArr[i] = sc.nextInt();
        }

        /**
         * 3장의 카드를 뽑아야 하므로 삼중 for문으로 모든 경우의 수를 찾으면 됨
         */
        int max = Integer.MIN_VALUE;
        for (int i=0; i<n; i++) {
            for (int j=i+1; j<n; j++) {
                for (int k=j+1; k<n; k++) {
                    int tmp = numArr[i] + numArr[j] + numArr[k];
                    if (max < tmp && m >= tmp) {
                        max = tmp;
                    }
                }
            }
        }

        System.out.println(max);
    }
}