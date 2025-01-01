import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int testCase = sc.nextInt();
        int[] numArr = new int[testCase];
        
        for (int i=0; i<testCase; i++) {
            int tmp = sc.nextInt();
            numArr[i] = tmp;
        }
        // 배열 정렬
        Arrays.sort(numArr);
        // 출력
        Arrays.stream(numArr).forEach(i -> System.out.println(i));
        
    }
}