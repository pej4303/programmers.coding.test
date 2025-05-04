import java.util.*;
class Solution {
    static Map<String, int[]> map = null;
    
    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();
        
        map = new HashMap<>();
        map.put("1", new int[]{0, 0});
        map.put("2", new int[]{0, 1});
        map.put("3", new int[]{0, 2});
        map.put("4", new int[]{1, 0});
        map.put("5", new int[]{1, 1});
        map.put("6", new int[]{1, 2});
        map.put("7", new int[]{2, 0});
        map.put("8", new int[]{2, 1});
        map.put("9", new int[]{2, 2});
        map.put("*", new int[]{3, 0});
        map.put("0", new int[]{3, 1});
        map.put("#", new int[]{3, 2});
        
        String preL = "*";
        String preR = "#";
        
        for (int num : numbers) {
           if (num == 1 || num == 4 || num == 7) {
               answer.append("L");
               preL = String.valueOf(num);
           } else if (num == 3 || num == 6 || num == 9) {
               answer.append("R");
               preR = String.valueOf(num);
           } else {
               // 거리 판단
               String tmp = calcDist(preL, preR, String.valueOf(num), hand);
               answer.append(tmp);
               // 왼손, 오른손 위치 갱신
               if (tmp.equals("L")) {
                    preL = String.valueOf(num);
               } else {
                   preR = String.valueOf(num);
               }
           }
        }
        
        return answer.toString();
    }
    
    // 거리 판단
    private String calcDist(String preL, String preR, String target, String hand) {
        int[] posTarget = map.get(target);
        int[] posLeft = map.get(preL);
        int[] posRight = map.get(preR);

        int distL = Math.abs(posTarget[0] - posLeft[0]) + Math.abs(posTarget[1] - posLeft[1]);
        int distR = Math.abs(posTarget[0] - posRight[0]) + Math.abs(posTarget[1] - posRight[1]);

        if (distL < distR) {
            return "L";
        } else if (distR < distL) {
            return "R";
        } else {
            return hand.equals("left") ? "L" : "R";
        }
    }
}