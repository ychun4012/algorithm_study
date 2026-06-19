import java.util.ArrayList;


class Solution {
    public int[] solution(int l, int r) {
        ArrayList<String> answer = new ArrayList<>();
        
        for (int i = l; i <= r; i++) {
            String s = String.valueOf(i);
            if (s.replace("5", "").replace("0", "").isEmpty()) {
                answer.add(s);
            }
        }
        if(answer.size() == 0) {
            answer.add("-1");
        }
        
        return answer.stream().mapToInt(Integer::parseInt).toArray();
    }
}