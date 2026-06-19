import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(n);
        
        while (n > 1) {
        if (n % 2 == 0) {
            list.add(n / 2);
            n = n / 2; 
        } else {
            list.add(3 * n + 1);
            n = 3 * n + 1;
        }
        }
        
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}