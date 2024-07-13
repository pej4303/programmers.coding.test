package algorithm;

import java.util.*;

/**
 * DFS 알고리즘 구현
 * @author pej
 * @date  2024.07.13
 * @version 1.0
 */
public class DFS {
    static ArrayList<Integer> result = new ArrayList<>(); // 결과 리스트
    public static void main(String[] args) {
        /**
         *   1
         *  2 3
         * 4 5 6
         *
         * 이렇게 되어 있음
         * 출력 : 1-2-4-5-3-6 or 1-3-6-5-2-4
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

//        for (int i = 1; i <= n; i++) {
//            System.out.println(treeList[i].toString());
//        }

        // 1번노드에서 DFS 실행
        dfs(1, treeList, visited, result);

        // 출력
        System.out.println(result.toString());
    }

    /**
     * DFS 알고리즘
     * @param node 현재 위치
     * @param treeList 트리 구조 리스트
     * @param visited 방문여부 체크 배열
     * @param result  결과 리스트
     */
    public static void dfs(int node, ArrayList<Integer>[] treeList, boolean[] visited, ArrayList<Integer> result) {
        Stack<Integer> stack = new Stack<>();
        // 시작 노드를 스택에 넣습니다.
        stack.push(node);

        // 스택이 빌 때까지 계속 반복합니다.
        while (!stack.isEmpty()) {
            // 스택에서 노드를 하나 꺼냅니다.
            int cur = stack.pop();
            // 꺼낸 노드의 방문여부 체크 합니다.
            visited[cur] = true;
            // 결과 리스트 넣습니다.
            result.add(cur);

            for (int i : treeList[cur]) {
                // 방문한 노드에 인접한 노드들중에 방문하지 않은 노드를 스택에 추가합니다.
                if (!visited[i]) {
                    stack.push(i);
                }
            }
        }
    }
}
