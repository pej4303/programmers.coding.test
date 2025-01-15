import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 시험장수

        int[] roomArr = new int[n];
        for (int i=0; i<n; i++) {
            roomArr[i] = sc.nextInt();
        }

        int b = sc.nextInt();  // 총감독관이 관리할 수 있는 응시자수
        int c = sc.nextInt();  // 부감독관이 관리할 수 있는 응시자수

        long result = n;  // 총감독관수 + 부감독관수

        for (int i=0; i<roomArr.length; i++) {
            // 각각의 시험장에 총감독관은 오직 1명만 있어야 하니까
            // 총감독관이 관리할 수 있는 응시자수만큼 배열에서 빼준다.
            roomArr[i] -= b;

            if (roomArr[i] <= 0) {
                continue;
            }

            result += roomArr[i] / c;
            if (roomArr[i] % c != 0) {
                result++;
            }
            
        }

      System.out.println(result);
    }
}