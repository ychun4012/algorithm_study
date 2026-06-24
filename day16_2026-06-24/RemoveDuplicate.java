import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int pre = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                pre = arr[i];
                list.add(pre);
            } else if (arr[i] != pre) {
                pre = arr[i];
                list.add(arr[i]);
            }
        }
        
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}