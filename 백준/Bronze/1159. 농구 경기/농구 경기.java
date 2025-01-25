import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String input = "";
        TreeMap<Character, Integer> map = new TreeMap<>();

        // 순회하면서 map에 성의 첫 글자랑 건수 담기
        for (int i=0; i<n; i++) {
            input = br.readLine();
            map.put(input.charAt(0), map.getOrDefault(input.charAt(0), 0) + 1);
        }

        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character, Integer> item : map.entrySet()) {
            // 성의 첫 글자가 같은 사람이 5명인지 판별
            if (item.getValue() >= 5) {
                sb.append(item.getKey());
            }
        }

        // 출력
        if ( sb.toString().length() == 0 ) {
            System.out.println("PREDAJA");
        } else {
            System.out.println(sb);
        }
    }
}