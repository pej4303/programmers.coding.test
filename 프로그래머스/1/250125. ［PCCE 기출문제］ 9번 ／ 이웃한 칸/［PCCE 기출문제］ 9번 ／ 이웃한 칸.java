class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        
        int n = board.length; // 
        int count = 0; // 같은 색으로 색칠된 칸의 개수를 저장할 변수
        int[] dh = { 0, 1, -1, 0 }; // h의 변화량 저장 배열
        int[] dw = { 1, 0, 0, -1 }; // w의 변화량 저장 배열
        
        for (int i=0; i<=3; i++) {
            int h_check = 0; // h 좌표 체크
            int w_check = 0; // w 좌표 체크
        
            h_check = h + dh[i];
            w_check = w + dw[i];
            // System.out.println(h_check + "," + w_check);
            
            // h_check가 0 이상 n 미만이고 w_check가 0 이상 n 미만
            if ( (0 <= h_check && h_check < n) && (0 <= w_check && w_check < n) ) {
                // board[h][w]와 board[h_check][w_check]의 값이 동일하다면 count의 값을 1 증가
                //System.out.println(board[h][w]);
                //System.out.println(board[h_check][w_check]);
                if ( board[h][w].equals(board[h_check][w_check]))  {
                    // System.out.println("if");
                    answer++;
                }
                
            }
        }
        
        return answer;
    }
}