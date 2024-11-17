import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = 0;
        int sum = 0;
        
        for (int i=0; i<5; i++) {
            n = sc.nextInt();
            
            if (n <40) {
                sum += 40;
            } else {
                sum += n;
            }
        }
        
        System.out.println( sum / 5 );
        
    }
}