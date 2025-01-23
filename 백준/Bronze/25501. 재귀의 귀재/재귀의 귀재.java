import java.io.*;
public class Main {
    static int callFunc = 0;   // recursion 함수의 호출 횟수

    public static void main(String[] args) throws Exception {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());   // 테스트케이스

        String str = "";
        int result = 0;     // 함수의 반환값
        
        for (int i=1; i<=t; i++) {
            str = br.readLine();
            
            callFunc = 0;
            
            result = isPalindrome(str);
            System.out.println( String.format("%d %d", result, callFunc) );
        }
    }

    public static int isPalindrome(String s) {
        return recursion(s, 0, s.length()-1);
    }

    public static int recursion(String s, int l, int r) {
        callFunc++;
        
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
    }
}