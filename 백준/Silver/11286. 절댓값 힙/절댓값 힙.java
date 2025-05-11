import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 연산의 개수
        int n = Integer.parseInt(br.readLine());

        // 1. 배열에 정수 x (x ≠ 0)를 넣는다.
        // 2. 배열에서 절댓값이 가장 작은 값을 출력하고, 그 값을 배열에서 제거한다.
        //    절댓값이 가장 작은 값이 여러개일 때는, 가장 작은 수를 출력하고, 그 값을 배열에서 제거한다.

        // 절대값을 기준으로 정렬되게 변경해줘야 한다.
        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> {
            int num1 = Math.abs(a);
            int num2 = Math.abs(b);
            if (num1 == num2) {
                // 절대값 같으면 실제 값 비교 (음수가 우선)
                return a - b;
            }
            return num1 - num2; // 절대값 기준 정렬
        });


        for (int i=0; i<n; i++) {
            // 입력에서 0이 주어진 회수만큼 답을 출력한다.
            // 만약 배열이 비어 있는 경우인데 절댓값이 가장 작은 값을 출력하라고 한 경우에는 0을 출력하면 된다.
            int num = Integer.parseInt(br.readLine());
            if ( num == 0) {
                if (queue.isEmpty()) {
                    System.out.println(0);
                } else {
                    System.out.println(queue.poll());
                }
            } else {
                queue.add(num);
            }
        }
    }
}
