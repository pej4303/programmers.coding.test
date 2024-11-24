import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int[] arr1 = new int[4];
        int[] arr2 = new int[2];

        for (int i=0; i<4; i++) {
            arr1[i] = sc.nextInt();
        }

        for (int i=0; i<2; i++) {
            arr2[i] = sc.nextInt();
        }


        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println(arr1[3] + arr1[2] + arr1[1] + arr2[1]);
    }
}