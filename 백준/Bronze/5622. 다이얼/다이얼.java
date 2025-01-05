import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        int sum = 0; // 전화 걸기 위한 최소 시간

        for (char c : word.toCharArray()) {
            switch (c) {
                case 'A': // 다이얼 2
                case 'B':
                case 'C':
                    sum += 3;
                    break;
                case 'D': // 다이얼 3
                case 'E':
                case 'F':
                    sum += 4;
                    break;
                case 'G': // 다이얼 4
                case 'H':
                case 'I':
                    sum += 5;
                    break;
                case 'J': // 다이얼 5
                case 'K':
                case 'L':
                    sum += 6;
                    break;
                case 'M': // 다이얼 6
                case 'N':
                case 'O':
                    sum += 7;
                    break;
                case 'P': // 다이얼 7
                case 'Q':
                case 'R':
                case 'S':
                    sum += 8;
                    break;
                case 'T': // 다이얼 8
                case 'U':
                case 'V':
                    sum += 9;
                    break;
                case 'W': // 다이얼 9
                case 'X':
                case 'Y':
                case 'Z':
                    sum += 10;
                    break;
            }
        }

        System.out.println(sum);
    }
}