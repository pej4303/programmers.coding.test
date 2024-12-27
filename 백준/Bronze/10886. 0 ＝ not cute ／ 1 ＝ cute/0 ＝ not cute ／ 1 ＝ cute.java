import java.util.*;
public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int countOne = 0;  // 1의 개수
        int countZero = 0; // 0의 개수
        for (int i=0; i<n; i++) {
            int tmp = sc.nextInt();
            
            if (tmp == 1) {
                countOne++;
            } else {
                countZero++;
            }
        }
        
        if (countOne > countZero) {
            System.out.println("Junhee is cute!");
        } else {
            System.out.println("Junhee is not cute!");
        }
    }
}