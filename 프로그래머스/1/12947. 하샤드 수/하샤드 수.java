class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String xStr = String.valueOf(x);
        int a = 0;
        for(char c : xStr.toCharArray()){
            a += c - '0';
        }
        if(x % a != 0) {
            answer = false;
        }
        return answer;
    }
}