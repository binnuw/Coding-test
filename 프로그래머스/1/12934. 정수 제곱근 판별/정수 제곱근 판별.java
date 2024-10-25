class Solution {
    public long solution(long n) {
        long answer = 0;
        for(long i = 1; i <= n/2 +1; i++) {
            if(i * i == n) {
                answer = (i + 1)*(i + 1);
                break;
            } else {
                answer = -1;
            }
        } 
        return answer;
    }
}