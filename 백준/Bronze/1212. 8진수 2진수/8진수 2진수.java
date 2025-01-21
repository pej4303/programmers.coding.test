import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String input = br.readLine();
        /**
         * 8진수 -> 2진수
         *  => 8진수 각 자릿수를 3자리 2진수로 변환하면 됨
         *  3 => 011 (맨앞자리여서 0을 생략함)
         *  1 => 001
         *  4 => 100
         *
         * 8진수 -> 10진수 -> 2진수로 하는 방법도 있지만 범위 초과로 제대로 변환이 되지 않을 가능성이 있음
         */
        char[] arr = input.toCharArray();
        for (int i=0; i<arr.length; i++) {
            if (i==0) {
                if (arr[i] == '0') {
                    System.out.print("0");
                } else if (arr[i] == '1') {
                    System.out.print("1");
                } else if (arr[i] == '2') {
                    System.out.print("10");
                } else if (arr[i] == '3') {
                    System.out.print("11");
                }
            } else {
                if (arr[i] == '0') {
                    System.out.print("000");
                } else if (arr[i] == '1') {
                    System.out.print("001");
                } else if (arr[i] == '2') {
                    System.out.print("010");
                } else if (arr[i] == '3') {
                    System.out.print("011");
                }
            }
            if (arr[i] == '4') {
                System.out.print("100");
            } else if (arr[i] == '5') {
                System.out.print("101");
            } else if (arr[i] == '6') {
                System.out.print("110");
            } else if (arr[i] == '7') {
                System.out.print("111");
            }
        }
    }
}