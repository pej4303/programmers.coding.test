import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int max_i = 0;
        int max_j = 0;

        for (int i=0; i<9; i++) {
            for (int j=0; j<9; j++) {
                int tmp = sc.nextInt();
                if (tmp > max) {
                    max = tmp;
                    max_i = i;
                    max_j = j;
                }
            }
        }

        System.out.println(max);
        System.out.println( String.format("%d %d", max_i + 1, max_j + 1) );
    }
}