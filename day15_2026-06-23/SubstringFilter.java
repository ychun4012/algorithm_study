import java.util.ArrayList;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < intStrs.length; i++) {
            int j = Integer.parseInt(intStrs[i].substring(s, s+l));
            if (j > k) {
                list.add(j);
            }
        }
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}