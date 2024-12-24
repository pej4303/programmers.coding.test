import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        String star = "*";
        
        for (int i=1; i<=n; i++) {
            System.out.println(star.repeat(i));
        }
        for (int i=n-1; i>0; i--) {
            System.out.println(star.repeat(i));
        }
    }
}