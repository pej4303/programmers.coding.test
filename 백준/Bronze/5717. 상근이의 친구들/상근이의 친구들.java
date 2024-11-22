import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            
            if (m == 0 && n == 0) {
                break;
            }
        
            System.out.println(m + n);    
        }
    }
}