import java.util.*;
public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int maxSum = Integer.MIN_VALUE;
        int index = 0;
        
        for (int i=1; i<=5; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            
            int sum = a+b+c+d;
            
            if (maxSum < sum ) {
                maxSum = sum;
                index = i;
            } 
        }
        
        // 출력
        System.out.println(index);
        System.out.println(maxSum);
    }
}