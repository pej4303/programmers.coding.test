package elice;

/**
 * ### 목표량
 *
 * ## 시간 제한: 1초
 *
 * 엘리스 토끼는 목표량을 정해 수학 문제를 열심히 풉니다. 목표량은 정수입니다.
 * 내일 풀 수학 문제의 개수는 오늘 푼 문제 개수의 수와 숫자의 구성이 같으면서, 오늘 푼 문제 개수의 수보다 큰 수 중 가장 작은 수입니다.
 * 예를 들어, 오늘 67문제를 풀었으면 다음 날 76문제를 풉니다.
 * 오늘 푼 문제의 개수를 줬을 때 다음날 풀 문제의 개수를 출력하는 프로그램을 작성하세요.
 *
 * ## 지시사항
 * 입력
 * + 첫 번째 줄에 오늘 푼 문제의 개수인 자연수 N을 입력합니다.
 * + 1≤N≤999999
 * + 정답이 반드시 있는 경우만 입력값으로 주어집니다.
 * 출력
 * + 다음날 풀 문제의 개수를 출력합니다.
 *
 * 입력예시 364
 * 출력예시 436
 */
import java.util.*;

class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int todayNumber = sc.nextInt();
        int result = tomorrowNumber(todayNumber);
        System.out.println(result);

        // 순열 테스트
//        char[] charArr = {'a', 'b', 'c'};
//        Set<String> test = new HashSet<>();
//        generatePermutations(charArr, 0, test);
//
//        for (String str : test) {
//            System.out.println(str);
//        }
    }

    public static int tomorrowNumber(int n) {
        // 오늘 푼 문제의 개수를 문자열로 변환
        String todayStr = String.valueOf(n);

        // 오늘 푼 문제의 개수의 모든 순열 생성
        Set<String> permutations = new HashSet<>();
        generatePermutations(todayStr.toCharArray(), 0, permutations);

        // 순열을 정수로 변환하고 오늘 푼 문제의 개수보다 큰 수만 필터링
        /**
         * TreeSet을 사용한 이유
         * 1. 자동 오름차순 기능
         * 2. 중복 제거
         * 3. 최소값 검색 가능 : first()
         */
        TreeSet<Integer> validNumbers = new TreeSet<>();
        for (String perm : permutations) {
            int num = Integer.parseInt(perm);  // 순열을 정수로 변환
            if (num > n) {  // 오늘 푼 문제의 개수보다 큰지 확인
                validNumbers.add(num);  // 크다면 유효한 후보로 추가
            }
        }

        // 오늘 푼 문제의 개수보다 큰 수 중에서 가장 작은 수 찾기
        return validNumbers.isEmpty() ? -1 : validNumbers.first();
    }

    /**
     * 모든 순열 만들기
     * @param chars
     * @param index
     * @param permutations
     */
    private static void generatePermutations(char[] chars, int index, Set<String> permutations) {
        /**
         * index가 chars.length - 1과 같을 때, 즉 모든 위치에 대해 순열이 완성된 경우, 현재 배열 상태를 문자열로 변환하여 permutations에 추가합니다.
         * 그렇지 않은 경우, 현재 인덱스부터 배열 끝까지 반복하면서 순열을 생성합니다.
         */
        if (index == chars.length - 1) {
            permutations.add(new String(chars));
            return;
        }

        for (int i = index; i < chars.length; i++) {
            // swap
            char temp = chars[index];
            chars[index] = chars[i];
            chars[i] = temp;
            
            // 재귀호출
            generatePermutations(chars, index + 1, permutations);

            // 재귀 호출이 끝난 후, 원래의 배열 상태를 복원하기 위해
            temp = chars[index];
            chars[index] = chars[i];
            chars[i] = temp;
        }
    }
}

