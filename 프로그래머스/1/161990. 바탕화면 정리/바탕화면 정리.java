class Solution {
    public int[] solution(String[] wallpaper) {
        /* 설계 흐름 */
        
        /*
        방법1)
        1. wallpaper 순회 - for문 이용
        2. lux, luy, rdx, rdy 값 갱신 - Math.min(), Math.max() 이용
        */
        
        int lux = Integer.MAX_VALUE;
        int luy = Integer.MAX_VALUE;
        int rdx = Integer.MIN_VALUE;
        int rdy = Integer.MIN_VALUE;
        int[] answer = new int[4];
        
        for (int i=0; i<wallpaper.length; i++) {
            char[] arr = wallpaper[i].toCharArray();
            for (int j=0; j<arr.length; j++) {
                if ( '#' == arr[j] ) {
                    //System.out.println("i = " + i);
                    //System.out.println("j = " + j);
                    
                    lux = Math.min(lux, i);
                    luy = Math.min(luy, j);
                    
                    rdx = Math.max(rdx, i+1);
                    rdy = Math.max(rdy, j+1);
                    
                    /*
                    System.out.println("lux = " + lux);
                    System.out.println("luy = " + luy);
                    System.out.println("rdx = " + rdx);
                    System.out.println("rdy = " + rdy);
                    */
                }
            }
        }
        
        /*
        System.out.println("lux = " + lux);
        System.out.println("luy = " + luy);
        System.out.println("rdx = " + rdx);
        System.out.println("rdy = " + rdy);
        */
        
        answer[0] = lux;
        answer[1] = luy;
        answer[2] = rdx;
        answer[3] = rdy;
        
        return answer;
    }
}