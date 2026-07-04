import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> map = new HashMap<>();
        
        // 중복 아니면 값이 1, 중복이면 값이 2
        // ex. 사과가 2명이면 키는 사과 하나지만 값은 2, 즉 값은 명수를 말하는 것
        for (int i = 0; i < participant.length; i++) {
            // 없으면 0, 있으면 가져오기 
            map.put(participant[i], map.getOrDefault(participant[i], 0) + 1);
        }
        
        // map에 completion 키가 있으면 값을 -1
        // ex. 완료한 사람은 0, 완료 못한 사람은 1
        // 중복있는 경우엔 한번만 -1되니까 1
        for (int i = 0; i < completion.length ; i++) {
            if (map.containsKey(completion[i])) {
                map.put(completion[i], map.get(completion[i]) - 1);
            }
        }
        
        // 0 이상인 사람을 골라 완주 못한 사람 찾아내기
        for (String key : map.keySet()) {
            if (map.get(key) > 0) {
                return answer = key;
            }
        }
        
        return answer;
    }
}