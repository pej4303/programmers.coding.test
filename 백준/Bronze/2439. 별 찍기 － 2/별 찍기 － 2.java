import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            int space = n - i;
            System.out.println(" ".repeat(space) + "*".repeat(i));
        }
    }
}