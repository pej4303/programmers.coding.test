package elice.day4;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * ### 트리위의 게임
 * 정점 N개의 트리에서 두 사람이 게임을 진행하려 한다.
 * 각 정점은 1번부터 N번 까지 번호가 매겨져 있고 루트노드는 1번 노드이다.
 * 게임은 서로 턴을 번갈아 가며 진행되고 트리 위에 놓을 수 있는 말과 함께 진행된다.
 * 두 사람의 점수는 모두 0점으로 시작한다.
 *
 * 각 턴마다 두 사람은 다음과 같은 작업을 반복한다.
 *
 * 현재 말이 놓여 있는 정점의 번호만큼 자신의 점수에 더한다.
 * 현재 말이 놓여 있는 정점의 자식 정점이 없다면 그대로 게임을 종료한다.
 * 자식 정점이 존재한다면 자식 정점 중 원하는 자식 정점으로 말을 옮긴다.
 * 게임이 종료되었을 때 선공의 점수가 후공의 점수보다 높거나 같다면 선공이 승리하고 아니라면 후공이 승리한다.
 * 두 사람이 최적으로 플레이할 때, 처음 말이 놓여져 있는 정점의 번호에 따라 선공이 이기는지 후공이 이기는지 구해보자.
 *
 * ## 지시사항
 * + 입력
 *  + 첫째 줄에 정점의 수 N이 주어진다.
 *      + 1≤N≤100000
 *  + 둘째 줄부터 N−1개의 줄에 간선을 나타내는 정수 u,v가 주어진다.
 *      + 1≤u,v≤N
 *  + 이는 u번 정점과 v번 정점을 잇는 간선이 존재한다는 뜻이다.
 *
 * + 출력
 *  + N개의 줄에 걸쳐 정답을 출력한다.
 *  + i번째 줄에는 말의 시작위치가 i번 정점일 때의 결과를 출력한다.
 *  + 선공이 이긴다면 1을 후공이 이긴다면 0을 출력한다.
 */

class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        // 첫번째줄 : 정점의 수
        int n = sc.nextInt();

        // 여러줄
        int[][] numArr = new int[n-1][2];
        for (int i = 0; i < numArr.length; i++) {
            numArr[i][0] = sc.nextInt();
            numArr[i][1] = sc.nextInt();
        }

        // 트리 노드 구성
        ArrayList<Integer>[] treeList = new ArrayList[n + 1];
        for (int i=1; i<=n; i++) {
            treeList[i] = new ArrayList<>();
        }
        //System.out.println("트리 노드 구성");
        // 트리에 담기
        for (int[] arr : numArr) {
            int parent = arr[0];
            int child = arr[1];

            treeList[parent].add(child);
            System.out.println(treeList[parent].toString());
        }
        //System.out.println("트리에 담기");
        // dfs
        int[] dp = new int[n + 1];
        dfs(1, treeList, dp);

        //System.out.println("dfs");
        // 출력
        for (int i=1; i<=n; i++) {
            System.out.println(dp[i]);
        }
    }

    public static int dfs(int node, ArrayList<Integer>[] treeList, int[] dp) {
        if (treeList[node].isEmpty()) {
            dp[node] = 1;
            return 1;
        }

        // 선공이 이긴다면 1을 후공이 이긴다면 0을 출력한다.
        int winner = 0;
        for (int tmpNode : treeList[node]) {
            if (dfs(tmpNode, treeList, dp) == 0) {
                winner = 1;
            }
        }

        dp[node] = winner;
        return winner;
    }
}