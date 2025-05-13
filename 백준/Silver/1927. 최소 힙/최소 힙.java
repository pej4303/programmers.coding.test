import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        // 우선순위 큐 생성
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        
        for (int i=0; i<n; i++) {
        	int num = Integer.parseInt(br.readLine());
        	if (num == 0) {
        		if (queue.isEmpty()) {
        			System.out.println(0);
        		} else {
        			// x가 0이라면 배열에서 가장 작은 값을 출력하고 그 값을 배열에서 제거하는 경우
            		System.out.println(queue.poll());
        		}
        	} else {
        		// x가 자연수라면 배열에 x라는 값을 넣는(추가하는) 연산
        		queue.add(num);
        	}
        }
    }
}