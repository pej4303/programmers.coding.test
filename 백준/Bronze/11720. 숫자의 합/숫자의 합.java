import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        String str = sc.nextLine(); 

        int sum = 0;
        for (int i=0; i<n; i++) {
            sum += Integer.parseInt(str.substring(i, i + 1));
        }

        System.out.println(sum);
    }
}