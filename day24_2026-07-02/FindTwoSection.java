import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int first = -1;
        int last = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (first == -1 && arr[i] == 2) {
                first = i;
            } else if (first != -1 && arr[i] == 2) {
                last = i;
            }
        }
        
        if (first == -1) {
            list.add(-1);
        } else if (last == 0) {
            list.add(2);
        } else {
            for (int i = first; i <= last; i++) {
            list.add(arr[i]);
            }
        }
        
        
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}