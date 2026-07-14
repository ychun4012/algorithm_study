import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int num : arr) {
        list.add(num);
        }   
        
        for (int i = 0; i < query.length; i++) {
            if (i%2 == 0) {
                list = new ArrayList<>(list.subList(0, query[i] + 1));
            } else {
                list = new ArrayList<>(list.subList(query[i], list.size()));
            }
        }
        
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}