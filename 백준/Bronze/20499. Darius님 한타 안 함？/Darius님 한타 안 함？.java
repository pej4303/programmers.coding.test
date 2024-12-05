import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = br.readLine();
        String[] arr = line.split("/");

        int k = Integer.parseInt(arr[0]);
        int d = Integer.parseInt(arr[1]);
        int a = Integer.parseInt(arr[2]);

        if ((k + a) < d || d == 0) {
            System.out.println("hasu");
        } else {
            System.out.println("gosu");
        }
    }
}