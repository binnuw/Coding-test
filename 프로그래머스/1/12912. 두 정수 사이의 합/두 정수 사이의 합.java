
class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        
        int min = Math.min(a, b),
            max = Math.max(a, b);
        
        for(; min <= max; min++) {
            answer += min;
        }
        return answer;
    }
}