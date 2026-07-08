import java.util.*;

class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int max = nums.length/2;
        
        for (int p: nums) {
            set.add(p);    
        }
        
        int answer = Math.min(set.size(), max);
        return answer;
    }
}