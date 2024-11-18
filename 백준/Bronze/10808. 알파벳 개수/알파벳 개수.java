import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[26];
        char[] cArr = sc.nextLine().toCharArray();

        for (int i=0; i<cArr.length; i++) {
            // 예) 'b'를 int로 출력하면 98
            //     계산하면 98 - 97 = 1이 나오면서 1번째 자리에 빈도수를 증가시킬 수 있음
            arr[cArr[i] - 97]++;
        }

        for (int n : arr) {
            System.out.print(n + " ");
        }
    }
}