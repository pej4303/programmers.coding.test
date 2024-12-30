import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] charArray = br.readLine().toCharArray();

        for (int i=0; i<26; i++) {
            int tmp = -1;
            for (int j=0; j<charArray.length; j++) {
                if (charArray[j] - 'a' == i) {
                    tmp = j;
                    break;
                }
            }
            System.out.print(tmp + " ");
        }
    }
}