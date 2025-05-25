import java.util.*;
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        
        // 한 번 사용한 카드는 다시 사용할 수 없습니다. => 먼저 들어온 순서대로 꺼내야함(FIFO) => 큐
        
        /* 설계 흐름 */
        
        /*
        방법1)
        1. cards1, cards2 배열을 큐로 변환
        2. goal 배열 순회 - for문 이용
        3. 현재 단어가 queue1.peek()이면 queue1.poll() 아니고 queue2.peek()이면 queue2.poll() 둘 다 아니면 return "No"
        4. 끝까지 다 순회했다면 return "Yes"
        */
        
        // 1. cards1, cards2 배열을 큐로 변환
        Queue<String> queue1 = new LinkedList<>();
        for (String str : cards1) {
            queue1.add(str);
        }
        
        Queue<String> queue2 = new LinkedList<>();
        for (String str : cards2) {
            queue2.add(str);
        }
        
        // 2. goal 배열 순회 - for문 이용
        for (String word : goal) {
            // cards1과 cards2에는 서로 다른 단어만 존재합니다. => 항상 둘 다 없거나, 둘중에 하나만 있다.
            // 3. 현재 단어가 queue1.peek()이면 queue1.poll() 아니고 queue2.peek()이면 queue2.poll() 둘 다 아니면 return "No"
            
            //System.out.println( "word =>" + word );
            //System.out.println( "queue1 =>" + queue1.peek() );
            //System.out.println( "queue2 =>" + queue2.peek() );
            
            if ( word.equals(queue1.peek()) ) {
                queue1.poll();
                //System.out.println( "queue1.poll" );
            } else if ( word.equals(queue2.peek()) ) {
                // queue2.peek()이면 queue2.poll()
                queue2.poll();
                //System.out.println( "queue2.poll" );
            } else {
                // 둘 다 아니면 return "No"
                answer = "No";
                break;
            }
        }
        
        return answer;
    }
}