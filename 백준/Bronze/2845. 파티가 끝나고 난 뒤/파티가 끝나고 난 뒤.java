import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();
        int p = sc.nextInt();

        int cnt = l * p;

        int[] arr = new int[5];
        for (int i=0; i<5; i++) {
            arr[i] = sc.nextInt() - cnt;
        }

        for (int i=0; i<5; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}