import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();    // 응시생
        int k = sc.nextInt();    // 커트라인

        int[] arr = new int[n];  // 점수 배열
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        // 배열 오름차순
        Arrays.sort(arr);
//        System.out.println( Arrays.toString(arr));
        // 배열 내림차순 : 오름차순한 원본 배열을 뒤집어서 넣기
        int[] descArr = new int[arr.length];
        for (int i=0; i<arr.length; i++) {
            descArr[i] = arr[arr.length - 1 - i];
        }
//        System.out.println( Arrays.toString(descArr));
        System.out.println(descArr[k-1]);
    }
}