import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 첫째줄
        int n = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();

        // 초기값 셋팅
        for (int i=1; i<=n; i++) {
            queue.add(i);
        }

        boolean isMove = false;
        while (queue.size() > 1) {
            queue.poll(); // 제일 위에 있는 카드 버리기
            int num = queue.poll(); // 다음 카드 뽑아서
            queue.add(num); // 맨 뒤로 이동
        }

        System.out.println(queue.peek());

    }
}