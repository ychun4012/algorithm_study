class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        int ab = Integer.valueOf(a+""+b);
        int ba = Integer.valueOf(b+""+a);
        
        if (ab > ba) {
            answer = ab;
        } else if (ba > ab) {
            answer = ba;
        } else if (ab == ba) {
            answer = ab;
        }
        
        
        return answer;
    }
}