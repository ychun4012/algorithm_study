class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int times = 1;
        int plus = 0;
        
        for (int num: num_list) {
            times *= num;
            plus += num;
        }
        
        answer = times < Math.pow(plus, 2)? 1 : 0;
        
        return answer;
    }
}