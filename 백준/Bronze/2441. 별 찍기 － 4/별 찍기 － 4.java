import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String space = " ";
        String star = "*";

        for (int i=n; i>=1; i--) {
            System.out.println(space.repeat(n-i) + star.repeat(i));
        }
    }
}