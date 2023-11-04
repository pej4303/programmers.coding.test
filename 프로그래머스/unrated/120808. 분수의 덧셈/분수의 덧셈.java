class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int tmp1 = 0; 
        int tmp2 = 0;
        int commonNum = 0;
        
        if ( validate(numer1) && validate(denom1) && validate(numer2) && validate(denom2)) {
            tmp1 = (denom1 * numer2) + (denom2 * numer1);
            tmp2 = denom1 * denom2;
            
            // 최대공약수 구하기
            commonNum = getMaxCommonNum(tmp1, tmp2); 
            
            answer[0] = tmp1 / commonNum;
            answer[1] = tmp2 / commonNum;
        }
        
        return answer;
    }
    // 유효성 검사
    public boolean validate(int num) {
        boolean result = false;
        
        if ( 0 < num && num <= 1000 ) {
            result = true;
        } 
        
        return result;
    }
    // 최대공약수 구하기
    public int getMaxCommonNum(int num1, int num2) {
		if ( num1 % num2 ==0 ) {
			return num2;
		}
        
		return getMaxCommonNum(num2, num1 % num2);
	}
}