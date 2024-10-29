class Solution {
    public int solution(long num) {
        int answer = 0;
        while(num != 1){
            if(num % 2==0){
                num/=2;
                answer+=1;
            } else if (num % 2 != 0) {
                num = (num * 3)+1;
                answer+=1;
            }
        }
        if(answer > 400) {
            answer = -1;
        }
        return answer;
    }
}