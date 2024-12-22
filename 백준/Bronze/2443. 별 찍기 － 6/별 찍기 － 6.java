import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String star = "*";
        String space = " ";
        int repeatCnt = 0;

        // 별찍기
        for (int i=n; i>0; i--) {
            repeatCnt = 2 * i - 1;
            System.out.println( space.repeat(n - i) + star.repeat(repeatCnt) );
        }
    }
}