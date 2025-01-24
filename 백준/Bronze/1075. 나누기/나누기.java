import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int f = Integer.parseInt(br.readLine());

        /**
         * 방법1) 순회하면서 나누어떨어지는 수의 끝자리 2자리만 TreeSet 담아서 첫번째를 출력
         * => 테스트 결과가 안 맞고 숫자가 커지면 오래 걸림
         */
        // 이런식으로 범위 지정 되게 변경 (400000 ~ 428392)
        /*
        StringBuilder sb = new StringBuilder();
        sb.append(n.charAt(0));
        for (int i=1; i<n.length(); i++) {
            sb.append("0");
        }
        int startIndex = Integer.parseInt(sb.toString());

        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i=startIndex; i<Integer.parseInt(n); i++ ) {
            if ( i % f == 0) {
                treeSet.add(i);
            }
        }
        System.out.println(treeSet.first());
        */
        n = n / 100; // 1234 => 12
        n = n * 100; // 12 => 1200

        while (true) {
            if (n % f == 0) {
                break;
            }
            n++;
        }

        String str = String.valueOf(n);
        if (str.length() == 1) {
            System.out.println("0" + str);
        } else {
            System.out.println(str.substring(str.length() - 2));
        }
    }
}
