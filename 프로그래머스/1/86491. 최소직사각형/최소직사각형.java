class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int max = 0, min = 0;
        
        for(int[] size : sizes){
            int big = Math.max(size[0], size[1]);
            int smail = Math.min(size[0], size[1]);
            
            if(big > max) max = big;
            if(smail > min) min = smail;
        }
        answer = max * min;
        return answer;
    }
}