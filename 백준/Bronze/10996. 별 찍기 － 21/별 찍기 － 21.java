import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String star = "*";
        String space = " ";
        
        if (n == 1) {
            System.out.println(star);
        } else {
            for (int i=0; i< n * 2; i++) {
                if (i % 2 == 0) {
                    for (int j=0; j<n; j++) {
                        if ( j % 2 == 0 ) {
                            System.out.print(star);
                        } else {
                            System.out.print(space);
                        }
                    }
                } else {
                    for (int j=0; j<n; j++) {
                        if ( j % 2 == 0 ) {
                            System.out.print(space);
                        } else {
                            System.out.print(star);
                        }
                    }
                }
                System.out.println("");
            }
        }
    }
}