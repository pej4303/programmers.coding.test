import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        input = input.toUpperCase();

        // 한 글자만 들어온 경우 자기 자신으로 나오게 추가
        if (input.length() == 1) {
            System.out.println(input);
            return;
        }

        int[] arr = new int[130];
        for (char ch : input.toCharArray()) {
            arr[(int)ch]++;
        }

        // 정렬을 하면 index값으로 알파벳을 출력 할 수 없다.
        int max = -1;
        int index = 0;
        for (int i=(int)'A'; i<=(int)'Z'; i++) {
            // 가장 많이 사용된 알파벳 찾기
            if (max < arr[i] ) {
                max = arr[i];
                index = i;
            }
        }

        // 가장 많이 사용된 알파벳이 여러 개 존재하는 경우 찾기
        int tmpMax = max;
        long cnt = Arrays.stream(arr).filter(i -> tmpMax == i).count();

        // 출력
        if ( cnt == 1) {
            System.out.println((char) index);
        } else {
            System.out.println("?");
        }
    }
}