import java.io.*;
import java.util.*;
public class Main {
    static int[] arr;
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        // 정렬
        Arrays.sort(arr);

        for (int i=0; i<m; i++) {
            int num = Integer.parseInt(st.nextToken());
            System.out.println( binarySearch(num) );
        }
    }

    private static int binarySearch(int target) {
        int left = 0;
        int right = arr.length - 1;

        while(left <= right) {
            // 중간값 찾기
            int mid = (left + right) / 2;

            if (arr[mid] == target) {  // 중간 값과 찾는 값(target)을 비교
                return 1;
            } else if (arr[mid] < target) { // 찾는 값이 작으면 왼쪽 절반 탐색
                left = mid + 1;
            } else {    // 크면 오른쪽 절반 탐색
                right = mid - 1;
            }
        }
        return 0;
    }
}