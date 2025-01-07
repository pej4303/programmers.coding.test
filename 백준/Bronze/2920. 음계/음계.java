import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[8]; // 음조 배열

        // 입력
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<8; i++) {
            arr[i] = sc.nextInt();
        }

        boolean isAsc = false;  // 오름차순 여부
        boolean isDes = false;  // 내림차순 여부
        // 배열을 순회화면서 전체적으로 오름 or 내림인지 판단
        for (int i=0; i<arr.length-1; i++) {
            if (arr[i] < arr[i+1]) {
                isAsc = true;
            } else if (arr[i] > arr[i+1]) {
                isDes = true;
            }
        }
//        System.out.println("isDes = " + isDes);
//        System.out.println("isAsc = " + isAsc);

        if (isAsc && isDes) {
            System.out.println("mixed");
        } else {
            if (isAsc) {
                System.out.println("ascending");
            } else if (isDes) {
                System.out.println("descending");
            }
        }
    }
}