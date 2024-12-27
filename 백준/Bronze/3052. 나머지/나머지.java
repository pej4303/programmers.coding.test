import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Integer> numSet = new HashSet<>();

        for (int i=0; i<10; i++) {
            int tmp = sc.nextInt();
            numSet.add( tmp % 42 );
        }

        System.out.println( numSet.size());
    }
}