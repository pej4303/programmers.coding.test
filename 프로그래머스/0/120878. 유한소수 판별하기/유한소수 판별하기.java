import java.util.*;

class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        // 기약분수 : 더 이상 약분할 수 없는 상태의 분수
        
        // 1. 기약분수로 만들기
        int gcd = gcd(a, b);
        
        a /= gcd; 
        b /= gcd;
        
        // 분자가 분모로 나누어 떨어지는 경우 유한소수
        // 예) a = 7 , b = 1
        if ( b == 1) {
            return 1;
        }
        
        // 2. 분모가 유한소수인지 판단하기
        answer = chekNum(b);
        
        return answer;
    }
    
    /* 최대 공약수 찾기 */
    public int gcd(int a, int b) {
        /*
        유클리드 호제법의 과정

        1. 두 수 a와 b에서 a>b라고 할 때, a를 b로 나누고 나머지를 구합니다.
        2. 나머지가 0이 아니면, b를 새로운 a로, 나머지를 새로운 b로 하여 다시 나눗셈을 반복합니다.
        3. 나머지가 0이 되는 순간의 b가 최대공약수입니다.
        
        예) a=18, b=12
        18 / 12 = 1(몫) , 6(나머지)
        12 / 6 = 2(몫) , 0(나머지)
        */
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    /* 유한소수 판별 */
    public int chekNum(int n) {
        int result = 0;
        // 소수 : 2를 제외하고는 모두 홀수
        // 소인수분해 : 소수로 나누어가는 과정
        
        // Set : 중복제거
        // TreeSet : 자동으로 오름차순이 됨
        Set<Integer> set = new TreeSet<>();
        for (int i=2; i<=n; i++) {
            while (n % i == 0) {
                n /= i;
                set.add(i);
            }
        }
        
        // 유한소수 : 2와 5만 존재해야됨 
        if (set.size() == 2) {
            if (set.contains(2) && set.contains(5)) {        
                result = 1;
            } else {
                result = 2;
            }
        } else if (set.size() == 1) {
            if (set.contains(2) || set.contains(5)) {        
                result = 1;
            } else {
                result = 2;
            }
        } else {
           result = 2;
        }
        
        /*boolean twoFlag = false;
        boolean fiveFlag = false;
        boolean elselag = false;
        
        for (Integer num : set) {
            if (num == 2) {
                twoFlag = true;
            } else if (num == 5) {
                fiveFlag = true;
            } else {
                elselag = true;
            }
        }
        
        if (twoFlag || fiveFlag && !elselag) {
            result = 1;
        } else {
            result = 2;
        }*/
        
        
        return result;
    }
}