import java.util.*;
public class Main  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String star = "*";
        String space = " ";
        int cnt = 0;

        for (int i=1; i<=n; i++) {
            cnt = 2 * i - 1;
            System.out.println(space.repeat(n - i) + star.repeat(cnt));
        }
    }
}