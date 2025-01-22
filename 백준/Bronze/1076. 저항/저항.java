import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        String str = "";
        long result = 1;   // 결과값

        for (int i=0; i<3; i++) {
            input = br.readLine();

            if (i != 2) {
                str += String.valueOf(Color.valueOf(input).value);
            } else {
                // 마지막은 곱한다.
                result = Long.parseLong(str) * Color.valueOf(input).multiply;
            }
        }
        // 출력
        System.out.println(result);
    }

    public enum Color {
          black(0,1)
        , brown(1, 10)
        , red(2, 100)
        , orange(3, 1000)
        , yellow(4, 10_000)
        , green(5, 100_000)
        , blue(6, 1_000_000)
        , violet(7, 10_000_000)
        , grey(8, 100_000_000)
        , white(9, 1_000_000_000)
        ;

        private int value;
        private int multiply;

        Color(int value, int multiply) {
            this.value = value;
            this.multiply = multiply;
        }
    }
}
