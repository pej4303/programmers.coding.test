import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int line = sc.nextInt();
        
        for (int i=0; i<line; i++) {
            int num = sc.nextInt();
            System.out.println("=".repeat(num));
        }
    }
}