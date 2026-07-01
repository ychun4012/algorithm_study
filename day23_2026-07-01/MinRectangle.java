class Solution {
    int garoMax = 0;
    int seroMax = 0;
    
    public int solution(int[][] sizes) {
        int answer = 0;
        
        for(int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] > sizes[i][1]) {
                getMax(sizes[i][0], sizes[i][1]);
            } else {
                getMax(sizes[i][1], sizes[i][0]);
            }
            
        }
        
        answer = garoMax * seroMax;
        
        return answer;
    }
    
    public void getMax(int garo, int sero) {
        if (garo > garoMax) {
            garoMax = garo;
        }
        if (sero > seroMax) {
            seroMax = sero;
        }
    }
}