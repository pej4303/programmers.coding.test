import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");
        int n = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);

        StringBuffer sb = null;

        for (int i=0; i<n; i++) {
            String str = br.readLine();

            sb = new StringBuffer();
            sb.append(str);

            bw.write(sb.reverse().toString() + "\n");
        }

        bw.flush();
    }
}