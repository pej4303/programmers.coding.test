package algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * BFS 알고리즘 구현
 * @author pej
 * @date  2024.07.13
 * @version 1.0
 */
public class BFS {
    static ArrayList<Integer> result = new ArrayList<>(); // 결과 리스트
    public static void main(String[] args) {
        /**
         *   1
         *  2 3
         * 4 5 6
         *
         * 이렇게 되어 있음
         * 출력 : 1-2-3-4-5-6
         */
        int[][] array = {
                {1, 2}, {1, 3},
                {2, 4}, {2, 5},
                {3, 5}, {3, 6}
        };

        int n = array.length;    // 노드의 개수
        boolean[] visited = new boolean[n + 1];  // 방문여부 체크 배열
        ArrayList<Integer>[] treeList = new ArrayList[n + 1];

        // 트리 구조 생성
        for (int i = 1; i <= n; i++) {
            treeList[i] = new ArrayList<>();
        }
        // 트리 구조에 데이터 담기
        for (int[] arr : array) {
            int parent = arr[0];
            int child = arr[1];

            treeList[parent].add(child);
        }

        // 1번노드에서 BFS 실행
        bfs(1, treeList, visited, result);

        // 출력
        System.out.println(result.toString());
    }

    /**
     * BFS 알고리즘
     * @param node 현재 위치
     * @param treeList 트리 구조 리스트
     * @param visited 방문여부 체크 배열
     * @param result  결과 리스트
     */
    public static void bfs(int node, ArrayList<Integer>[] treeList, boolean[] visited, ArrayList<Integer> result) {
        Queue<Integer> queue = new LinkedList<Integer>();
        // 1. 시작노드를 큐에 삽입합니다.
        queue.offer(node);
        // 방문한 노드로 표시합니다.
        visited[node] = true;

        // 5. 큐가 빌 때까지 반복
        while(!queue.isEmpty()) {
            // 2. 큐에서 노드를 꺼내 해당 노드의 모든 인접 노드를 검사합니다.
            int cur = queue.poll();
            // 결과 리스트 넣습니다.
            result.add(cur);
            // 3. 큐에서 꺼낸 노드와 연결된 노드들 체크
            for (int i : treeList[cur]) {
                // 4. 방문한 노드에 인접한 노드들중에 방문하지 않은 노드를 큐에 추가합니다.
                if (!visited[i]) {
                    queue.offer(i);
                    visited[i] = true;
                }
            }
        }
    }
}
