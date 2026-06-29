import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new ArrayDeque<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        // 진행일 구하기
        for (int i = 0; i < speeds.length; i++) {
            int remainingDays = (int) Math.ceil((100.0 - progresses[i]) / speeds[i]);
            queue.offer(remainingDays);
        }
        
        // 진행일을 기준으로 함께 배포될 기능 묶기
        while (!queue.isEmpty()) {
            int count = 1;
            int head = queue.poll();

            while (!queue.isEmpty() && queue.peek() <= head) {
                queue.poll();
                count++;
            }

            list.add(count);[ 
        }
        
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}