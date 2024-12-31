import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        int[] numArr = new int[10];

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int num = a * b * c;
        
        // 아스키 코드 이용
        for (char ch : String.valueOf(num).toCharArray()) {
            numArr[ch - '0']++;
        }

        Arrays.stream(numArr).forEach(i -> System.out.println(i));
    }
}