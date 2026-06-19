class Solution {
    public int solution(int a, int d, boolean[] included) {

        int total = 0;
        for(int i = 0; i < included.length; i++) {
            if (included[i]) total += a + (d*i);
        }
        
        return total;
    }
}