class Solution {
    public int solution(int n) {
        int answer = 0;
        String nS ="";
        while(n!=0){
            nS += n%3;
            n = n/3;
        }
        answer = Integer.parseInt(nS,3);
        return answer;
    }
}