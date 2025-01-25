import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[] arr = new int[9];
        int sum = 0;
        
        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        // 합이 100이 되는 두 난쟁이 찾기
        for ( int i=0; i<9; i++ ) {
            for ( int j=i+1; j<9; j++ ) {
                // 두 난쟁이를 제외한 합이 100인지 확인
                if ( sum - arr[i] - arr[j] == 100 ) {
                    for ( int k=0; k<9; k++ ) {
                        if ( k != i && k != j ) {
                            System.out.println(arr[k]);
                        }
                    }
                    break;
                }
            }
        }
    }
}