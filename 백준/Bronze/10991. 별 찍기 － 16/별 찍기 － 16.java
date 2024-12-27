import java.util.*;
public class Main {
    public static void main (String[] args) {
        StringBuilder sb = null;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            sb = new StringBuilder();
            if (i == 1) {
                sb.append(" ".repeat(n - i) + "*".repeat(i));
            } else {
                sb.append(" ".repeat(n - i));
                for (int j=1; j<=i; j++) {
                    sb.append("* ");
                }
            }
            System.out.println(sb);
        }
    }
}