import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        Stack<Character> stack = new Stack<>();
        int result = 0;

        for (int i=0; i<input.length(); i++) {
            char c = input.charAt(i);
//            System.out.println("## 문자: " + c);
            if (c == '(') {
                stack.push(c);
            } else {
                stack.pop();
                if (input.charAt(i-1) == '(') {
                    result += stack.size();
//                    System.out.println("## 레이저: 현재 스택 크기만큼 자름 (" + stack.size() + ") ##");
                } else {
                    result += 1;
//                    System.out.println("## 쇠막대기 끝 ##");
                }
            }
//            System.out.println("현재 스택 상태: " + stack);
//            System.out.println("result: " + result);
//            System.out.println("------------");
        }
        System.out.println(result);
    }
}