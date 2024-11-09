import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int tmp = 0;

        for (int i=1; i<=9; i++) {
            tmp = n * i;
            System.out.println(String.format("%d * %d = %d", n, i, tmp));
        }
    }
}