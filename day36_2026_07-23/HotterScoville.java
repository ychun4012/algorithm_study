import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        int count = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int s: scoville) {
            pq.offer(s);
        }
        
        // 힙의 맨 앞(최솟값)이 K 미만이면
        // 두 개 꺼내서 섞어서 다시 넣기
        // count++
        // 배열에 size가 1인데 k가 못넘는 경우 -1 return
        while(pq.peek() < K) {
            if (pq.size() == 1) return -1;

            pq.offer(pq.poll() + (pq.poll() * 2));
            count++;
        }
        
        
        return count;
    }
}