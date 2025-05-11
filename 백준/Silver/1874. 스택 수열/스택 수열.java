import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 첫째줄
        int n = Integer.parseInt(br.readLine());
        // 둘째줄
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        int num = 1;

        for (int i=0; i<n; i++) {
            if (arr[i] >= num) {
                while (arr[i] >= num) {
                    stack.push(num++);
                    sb.append("+");
                    sb.append("\n");
                }
                stack.pop();
                sb.append("-");
                sb.append("\n");
            } else if (arr[i] < num ) {
                int tmp = stack.pop();
                if ( tmp > arr[i] ) {
                    System.out.println("NO");
                    return;
                } else {
                    sb.append("-");
                    sb.append("\n");
                }
            }
        }

        System.out.println(sb);
    }
}