import java.util.*;
class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] position = {0 , 0};
        
        int maxRight = board[0] / 2;
        int minLeft = (board[0] / 2) * -1;
        int minDown = (board[1] / 2) * -1;
        int maxUp = board[1] / 2;
        
        for (String str : keyinput) {
            switch (str) {
                case "up" :
                    position[1] += 1;
                    if (maxUp < position[1]) {
                        position[1] = maxUp;
                    }
                    break;
                case "down" :
                    position[1] -= 1;
                    if (minDown > position[1]) {
                        position[1]= minDown;
                    }
                    break;
                case "left" :
                    position[0] -= 1;
                    if (minLeft > position[0]) {
                        position[0] = minLeft;
                    }
                    break;
                case "right" :
                    position[0] += 1;
                    if (maxRight < position[0]) {
                        position[0] = maxRight;
                    }
                    break;
            }
        }
        
        // System.out.println( Arrays.toString(position) );
        
        return position;
    }
}