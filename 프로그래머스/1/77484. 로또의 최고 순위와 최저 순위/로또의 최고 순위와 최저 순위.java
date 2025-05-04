import java.util.Arrays;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int sameCnt = 0;
        int zeroCnt = 0;

        for (int lotto : lottos) {
            if (lotto == 0) {
                zeroCnt++;
            } else {
                for (int win : win_nums) {
                    if (lotto == win) {
                        sameCnt++;
                        break;
                    }
                }
            }
        }

        int maxCnt = sameCnt + zeroCnt;
        int minCnt = sameCnt;

        int[] answer = new int[2];
        answer[0] = getRank(maxCnt);
        answer[1] = getRank(minCnt);

        return answer;
    }

    // 순위 계산 함수
    private int getRank(int cnt) {
        return switch (cnt) {
            case 6 -> 1;
            case 5 -> 2;
            case 4 -> 3;
            case 3 -> 4;
            case 2 -> 5;
            default -> 6;
        };
    }
}
