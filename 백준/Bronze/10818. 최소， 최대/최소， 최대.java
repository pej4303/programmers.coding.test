import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int tmp = sc.nextInt();

        int max = tmp;
        int min = tmp;
        for (int i=2; i<=n; i++) {
            tmp = sc.nextInt();
            max = Math.max(max, tmp);
            min = Math.min(min, tmp);
        }

        System.out.println(String.format("%d %d", min, max));
    }
}