import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력 받기 위한 BufferedReader 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken()); // 시작 수 A
        long b = Long.parseLong(st.nextToken()); // 목표 수 B

        // BFS 방식으로 최소 연산 횟수 계산
        int result = bfs(a, b);

        // 결과 출력
        System.out.println(result);
    }

    private static int bfs(long a , long b) {
        // BFS를 위한 큐 선언 (배열의 형태: [현재값, 연산 횟수])
        Queue<long[]> queue = new LinkedList<>();
        queue.add(new long[]{a, 1}); // 시작값 A와 연산 횟수 1을 큐에 추가

        while (!queue.isEmpty()) {
            long[] now = queue.poll();
            long val = now[0];
            int cnt = (int) now[1];

            // 목표 값 B에 도달했으면 연산 횟수 반환
            if (val == b) {
                return cnt;
            }

            // 연산 1: 현재 값 * 2가 B보다 작거나 같으면 큐에 추가
            if (val * 2 <= b) {
                queue.add(new long[]{val * 2, cnt + 1});
            }

            // 연산 2: 현재 값 * 10 + 1이 B보다 작거나 같으면 큐에 추가
            if (val * 10 + 1 <= b) {
                queue.add(new long[]{val * 10 + 1, cnt + 1});
            }
        }

        // 큐가 모두 비었는데도 B에 도달하지 못하면 -1 반환
        return -1;
    }
}