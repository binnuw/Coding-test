class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for(int k = left; k <= right; k++){
            int count = 0;
            for(int i = 1; i * i <= k; i++){
                if(k % i == 0) {
                    count++;
                    if(k / i != i){
                        count++;
                    }
                }
            }
            if(count%2 ==0) answer += k;
            else answer -= k; 
        }
        return answer;
    }
}