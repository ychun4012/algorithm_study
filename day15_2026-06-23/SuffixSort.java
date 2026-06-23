import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public String[] solution(String my_string) {
        ArrayList<String> list = new ArrayList<>();
        
        for (int i = 0; i < my_string.length(); i++) {
            list.add(my_string.substring(i, my_string.length()));
        }
        
        String[] answer = list.toArray(new String[0]);
        Arrays.sort(answer);
        return answer;
    }
}