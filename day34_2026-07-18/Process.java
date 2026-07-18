import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
 
        Queue<int[]> queue = new ArrayDeque<>();
        // queue에 배열로 프로세스 넣기
        // [0]은 location, [1]은 프로세스
        for (int i = 0; i < priorities.length; i++) {
            queue.offer(new int[]{i, priorities[i]});
        }
 
        while (!queue.isEmpty()) {
            // 맨 앞 프로세스 꺼내기
            int[] current = queue.poll();
 
            // queue의 가장 큰 우선순위 구하기
            int max = 0;
            for (int[] p : queue) {
                if (p[1] > max) max = p[1];
            }

            // max보다 작으면 다시 넣기
            if (current[1] < max) {
                queue.offer(current);
            // 같거나 크면 answer++하고 location으로 확인 후 다시 while 돌거나 answer 리턴
            // location의 값이 몇번째로 빠져나갔냐를 구할 수 있음
            } else {
                answer++;
                if (current[0] == location) {
                    return answer;
                }
            }
        }
        return answer;
 
    }
}