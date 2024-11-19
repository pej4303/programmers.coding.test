import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int answer = 0;
        for (int i=0; i<5; i++) {
            if (n == sc.nextInt()) {
                answer++;
            }
        }
        
        System.out.println(answer);
    }
}