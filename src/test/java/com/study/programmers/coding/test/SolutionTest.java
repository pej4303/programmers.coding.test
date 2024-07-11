package com.study.programmers.coding.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.*;

public class SolutionTest {
    public static void main(String[] args) {
//        int[][] data = {
//            {1, 20300104, 100, 80},
//            {2, 20300804, 847, 37},
//            {3, 20300401, 10, 8},
//        };
//        String ext = "date";
//        int val_ext = 20300501;
//        String sort_by = "remain";
//
//        int[][] result = solution(data, ext, val_ext, sort_by);
//
//        Arrays.stream(result).forEach(i -> System.out.println(Arrays.toString(i)));

//        int i =0 ;
//        while (true) {
//            i++;
//            System.out.println(i);
//            if (i == 4) {
//                break;
//            }
//        }
    }



    public static int getIdx (String type) {
        int idx = 0;
        switch (type) {
            case "code":
                idx = 0;
                break;
            case "date":
                idx = 1;
                break;
            case "maximum":
                idx = 2;
                break;
            case "remain":
                idx = 3;
                break;
        }
        return idx;
    }

    public static int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        // 문제 : data에서 ext 값이 val_ext보다 작은 데이터만 뽑은 후, sort_by에 해당하는 값을 기준으로 오름차순으로 정렬
        int j = 0;
        // 데이터 순서 :  [코드 번호(code), 제조일(date), 최대 수량(maximum), 현재 수량(remain)]

        int extIdx = getIdx(ext);
        int sortIdx = getIdx(sort_by);

        ArrayList<int[]> list = new ArrayList<>();

        // 제한사항
        if ( 1<= data.length && data.length <= 500 ) {
            for (int i=0; i<data.length; i++) {
                int tmp = data[i][extIdx];
                if ( val_ext > tmp) {
                    list.add(data[i]);
                }
            }
        }

        // 정렬
        list.sort(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                // 비교 연산자를 사용하여 비교
                return Integer.compare(o1[sortIdx],o2[sortIdx]);
            }
        });

        int[][] answer = new int[list.size()][4];
        for (int a=0; a<list.size(); a++) {
            int[] tmp = list.get(a);
            for (int b=0; b<4; b++) {
                answer[a][b] = tmp[b];
            }
        }

        return answer;
    }

    @Test
    void test1() {
        int[][] answer = {};
        int[][] data = {
                {1, 20300104, 100, 80},
                {2, 20300804, 847, 37},
                {3, 20300401, 10, 8},
        };

        List<int[]> list = new ArrayList<>();

        for (int i=0; i<data.length; i++) {
            list.add(data[i]);
        }


        final int j = 1;

//        list.stream().sorted(new Comparator<int[]>() {
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                // 비교 연산자를 사용하여 비교
//                return Integer.compare(o2[j], o1[j]);
//            }
//        });

        list.sort(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                // 비교 연산자를 사용하여 비교
                return Integer.compare(o2[j], o1[j]);
            }
        });

        list.forEach(i -> System.out.println(Arrays.toString(i)));

        for (int a=0; a<list.size(); a++) {
            int[] tmp = list.get(a);
            for (int b=0; b<4; b++) {
                answer[a][b] = tmp[b];
            }
        }
    }

    @Test
    @DisplayName("Stack 테스트")
    void stackTest() {
        /**
         * Stack : 후입선출(LIFO, Last-In-First-Out) 구조를 가지는 자료구조
         *         스택은 주로 데이터를 임시로 저장하거나 역추적을 위해 사용됩니다.
         *         Stack 클래스는 Vector 클래스를 확장하여 구현되었기 때문에, 배열 기반의 동적 크기 조정이 가능한 스택을 제공합니다.
         *
         * push(element): 스택의 맨 위에 요소를 추가합니다.
         * pop(): 스택의 맨 위에 있는 요소를 제거하고 반환합니다.
         * peek(): 스택의 맨 위에 있는 요소를 반환합니다. 제거하지 않습니다.
         * empty(): 스택이 비어있는지 여부를 확인합니다.
         * search(element): 스택에서 지정된 요소를 찾아 그 위치를 반환합니다. 스택의 맨 위 요소부터 거리를 1로 시작하여 카운트합니다. 요소가 발견되지 않으면 -1을 반환합니다.
         */
        Stack<Integer> stack = new Stack<>();

        // 스택에 요소 추가
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // 스택의 맨 위 요소 확인
        System.out.println("맨 위 요소: " + stack.peek()); // 출력: 3

        // 스택에서 요소 제거
        int removedElement = stack.pop();
        System.out.println("제거된 요소: " + removedElement); // 출력: 3

        // 스택이 비어있는지 확인
        System.out.println("스택이 비어있는가? " + stack.empty()); // 출력: false
    }

    @Test
    @DisplayName("올바른 괄호")
    void test2() {
//        String s = "(())()";
        String s = "(()(";
        boolean result = false;
        boolean answer = false;

//        Stack<String> stack = new Stack<>();
//        for (String str : s.split("")) {
//            if ("(".equals(str)) {
//                stack.push(str); // 요소 넣기
//            } else if (")".equals(str)) {
//                if (stack.isEmpty()) {
//                    result = false;
//                }
//                stack.pop(); // 맨 위에 있는 요소를 제거
//            }
//        }

        // String에서 Character로 변경하니 효율성 테스트 성공하였음
        // char는 원시 타입으로 단일문자일때, String보다 더 빠름
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push('(');
            } else if (c == ')') {
                if (stack.isEmpty()) {
                    result = false;
                }
                stack.pop();
            }
        }

        // () 한쌍으로 올바른 괄호라면 개수가 0이 나옴
        System.out.println("개수 : " + stack.size());

        result = stack.isEmpty();

        Assertions.assertEquals(answer, result);
    }

    @Test
    @DisplayName("Queue 테스트")
    void queueTest() {
        /**
         * Queue : 선입선출(FIFO, First-In-First-Out) 구조를 가지는 자료구조
         *         큐는 주로 데이터를 임시로 저장하거나 작업을 처리할 때 사용됩니다.
         * 큐 구현체 : LinkedList, ArrayDeque
         *
         * add(element): 큐에 요소를 추가합니다. 큐의 용량 제한을 초과하면 예외가 발생합니다.
         * offer(element): 큐에 요소를 추가합니다. 용량 제한을 초과하면 false를 반환합니다.
         * remove(): 큐의 맨 앞에 있는 요소를 제거하고 반환합니다. 큐가 비어있으면 예외가 발생합니다.
         * poll(): 큐의 맨 앞에 있는 요소를 제거하고 반환합니다. 큐가 비어있으면 null을 반환합니다.
         * element(): 큐의 맨 앞에 있는 요소를 반환하되, 큐를 수정하지는 않습니다. 큐가 비어있으면 예외가 발생합니다.
         * peek(): 큐의 맨 앞에 있는 요소를 반환하되, 큐를 수정하지는 않습니다. 큐가 비어있으면 null을 반환합니다.
         */
        Queue<String> queue = new LinkedList<>();

        // 큐에 요소 추가
        queue.add("Java");
        queue.add("Python");
        queue.add("C++");

        // 큐의 모든 요소 출력
        System.out.println("Queue: " + queue);

        // 큐에서 요소 제거 및 출력
        String removedElement = queue.remove();
        System.out.println("Removed Element: " + removedElement);

        // 큐의 맨 앞 요소 확인
        String peekedElement = queue.peek();
        System.out.println("Peeked Element: " + peekedElement);

        // 큐의 모든 요소 출력
        System.out.println("Queue after removal: " + queue);
    }

    @Test
    @DisplayName("프로세스")
    void test3() {
        int[] priorities = {1, 1, 9, 1, 1, 1};
        int location = 0;
        int answer = 0;
        int result = 5;

        // 우선순위 큐 선언(내림 차순)
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        // 우선순위 큐에 우선순위 요소 추가
        for (int i : priorities) {
            queue.offer(i);
        }
        System.out.println("Queue: " + queue);


        // 큐가 빌 때까지 반복
        while (!queue.isEmpty()) {
            // 기존 우선순위 배열 순회
            for (int i = 0; i < priorities.length; i++) {
                // 현재 작업이 location과 같으면 answer 반환
                if (location == i) {
                    result = i;
                }
                // 현재 작업의 위치 찾기
                if (queue.peek() == priorities[i]) {
                    queue.poll();
                    answer++;
                }
            }
        }

        Assertions.assertEquals(answer, result);
    }
}
